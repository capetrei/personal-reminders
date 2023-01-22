import React from 'react';
import { GroceryClient } from '../generated/Grocery_grpc_web_pb.js';
import { GroceryRequest } from '../generated/Grocery_pb.js';
import AllGroceries from '../functions/AllGroceries';

const { REACT_APP_GRPC_BACKEND } = process.env;
var client = new GroceryClient(`${REACT_APP_GRPC_BACKEND}`);

class Grocery extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      item: '',
      shopURL: ''
    };
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);

  }

  handleChange = (event) => {
    this.setState({ [event.target.name]: event.target.value });
  }

  handleSubmit = (event) => {
    event.preventDefault();

    var groceryRequest = new GroceryRequest();
    groceryRequest.setOwner(this.state.item);
    groceryRequest.setAssignee(this.state.shopURL);

    client.setGrocery(groceryRequest, null, function (err, response) {

      var groceryStatus = response.toObject();
      console.log(groceryStatus)

    });
    window.location.reload();
  };

  render() {
    return (
      <>
        <div id="detail">
          <form onSubmit={this.handleSubmit} id="contact-form">
            <label>Item:
              <input
                type="text"
                name="item"
                value={this.state.item || ""}
                onChange={this.handleChange}
              />
            </label>
            <label>Shop URL:
              <input
                type="text"
                name="shopURL"
                value={this.state.shopURL || ""}
                onChange={this.handleChange}
              />
            </label>
            <input type="submit" />
          </form>

          <AllGroceries />
        </div>
      </>
    )
  };
}

export default Grocery;
