import React, { useState, useEffect } from 'react';
import { BillClient } from '../generated/Bill_grpc_web_pb.js';
import google_protobuf_empty_pb from 'google-protobuf/google/protobuf/empty_pb.js';
import DataTable from './DataTableBase'

const { REACT_APP_GRPC_BACKEND } = process.env;
var client = new BillClient(`${REACT_APP_GRPC_BACKEND}`);

function AllBills() {

  const [data, setData] = useState({});
  const columns = [
    {
      name: 'id',
      selector: row => row.id,
      sortable: true,
    },
    {
      name: 'service',
      selector: row => row.service,
      sortable: true,
    },
    {
      name: 'providerURL',
      selector: row => row.providerurl,
      sortable: true,
    }
  ];
  useEffect(() => {
    client.listBills(new google_protobuf_empty_pb.Empty(), null, function (err, response) {
      if (response == null) {
        console.log(err)
      } else {
        var newBills = response.toObject()
        if (data.billsList === undefined || data.billsList.length !== newBills.billsList.length) {
          setData(newBills)
        }
      }
    });
  }, [data]);

  return (
    <div id="detail">
      <DataTable columns={columns} data={data.billsList} selectableRows />
    </div>
  );
}

export default AllBills;
