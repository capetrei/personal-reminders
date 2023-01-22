import React from 'react';
import { BillClient } from '../generated/Bill_grpc_web_pb.js';
import { BillRequest } from '../generated/Bill_pb.js';
import AllGroceries from '../functions/AllGroceries';

const { REACT_APP_GRPC_BACKEND } = process.env;
var client = new BillClient(`${REACT_APP_GRPC_BACKEND}`);

class Bill extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      service: '',
      providerURL: ''
    };
    this.handleChange = this.handleChange.bind(this);
    this.handleSubmit = this.handleSubmit.bind(this);

  }

  handleChange = (event) => {
    this.setState({ [event.target.name]: event.target.value });
  }

  handleSubmit = (event) => {
    event.preventDefault();

    var billRequest = new BillRequest();
    billRequest.setOwner(this.state.service);
    billRequest.setAssignee(this.state.providerURL);

    client.setBill(billRequest, null, function (err, response) {

      var billStatus = response.toObject();
      console.log(billStatus)

    });
    window.location.reload();
  };

  render() {
    return (
      <>
        <div id="detail">
          <form onSubmit={this.handleSubmit} id="contact-form">
            <label>Service:
              <input
                type="text"
                name="service"
                value={this.state.service || ""}
                onChange={this.handleChange}
              />
            </label>
            <label>Provider URL:
              <input
                type="text"
                name="providerURL"
                value={this.state.providerURL || ""}
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

export default Bill;
