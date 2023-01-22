import React, { useState, useEffect } from 'react';
import { GroceryClient } from '../generated/Grocery_grpc_web_pb.js';
import google_protobuf_empty_pb from 'google-protobuf/google/protobuf/empty_pb.js';
import DataTable from './DataTableBase'

const { REACT_APP_GRPC_BACKEND } = process.env;
var client = new GroceryClient(`${REACT_APP_GRPC_BACKEND}`);

function AllGroceries() {

  const [data, setData] = useState({});
  const columns = [
    {
      name: 'id',
      selector: row => row.id,
      sortable: true,
    },
    {
      name: 'item',
      selector: row => row.item,
      sortable: true,
    },
    {
      name: 'shopURL',
      selector: row => row.shopurl,
      sortable: true,
    }
  ];
  useEffect(() => {
    client.listGroceries(new google_protobuf_empty_pb.Empty(), null, function (err, response) {
      if (response == null) {
        console.log(err)
      } else {
        var newGroceries = response.toObject()
        if (data.groceriesList === undefined || data.groceriesList.length !== newGroceries.groceriesList.length) {
          setData(newGroceries)
        }
      }
    });
  }, [data]);

  return (
    <div id="detail">
      <DataTable columns={columns} data={data.groceriesList} selectableRows />
    </div>
  );
}

export default AllGroceries;
