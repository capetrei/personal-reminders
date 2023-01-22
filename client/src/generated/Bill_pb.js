// source: Bill.proto
/**
 * @fileoverview
 * @enhanceable
 * @suppress {missingRequire} reports error on implicit type usages.
 * @suppress {messageConventions} JS Compiler reports an error if a variable or
 *     field starts with 'MSG_' and isn't a translatable message.
 * @public
 */
// GENERATED CODE -- DO NOT EDIT!
/* eslint-disable */
// @ts-nocheck

var jspb = require('google-protobuf');
var goog = jspb;
var global = Function('return this')();

var google_protobuf_empty_pb = require('google-protobuf/google/protobuf/empty_pb.js');
goog.object.extend(proto, google_protobuf_empty_pb);
goog.exportSymbol('proto.personal.reminders.server.proto.BillProto', null, global);
goog.exportSymbol('proto.personal.reminders.server.proto.BillRequest', null, global);
goog.exportSymbol('proto.personal.reminders.server.proto.BillResponse', null, global);
goog.exportSymbol('proto.personal.reminders.server.proto.ListBillsResponse', null, global);
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.personal.reminders.server.proto.BillProto = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.personal.reminders.server.proto.BillProto, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.personal.reminders.server.proto.BillProto.displayName = 'proto.personal.reminders.server.proto.BillProto';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.personal.reminders.server.proto.BillRequest = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.personal.reminders.server.proto.BillRequest, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.personal.reminders.server.proto.BillRequest.displayName = 'proto.personal.reminders.server.proto.BillRequest';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.personal.reminders.server.proto.BillResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, null, null);
};
goog.inherits(proto.personal.reminders.server.proto.BillResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.personal.reminders.server.proto.BillResponse.displayName = 'proto.personal.reminders.server.proto.BillResponse';
}
/**
 * Generated by JsPbCodeGenerator.
 * @param {Array=} opt_data Optional initial data array, typically from a
 * server response, or constructed directly in Javascript. The array is used
 * in place and becomes part of the constructed object. It is not cloned.
 * If no data is provided, the constructed object will be empty, but still
 * valid.
 * @extends {jspb.Message}
 * @constructor
 */
proto.personal.reminders.server.proto.ListBillsResponse = function(opt_data) {
  jspb.Message.initialize(this, opt_data, 0, -1, proto.personal.reminders.server.proto.ListBillsResponse.repeatedFields_, null);
};
goog.inherits(proto.personal.reminders.server.proto.ListBillsResponse, jspb.Message);
if (goog.DEBUG && !COMPILED) {
  /**
   * @public
   * @override
   */
  proto.personal.reminders.server.proto.ListBillsResponse.displayName = 'proto.personal.reminders.server.proto.ListBillsResponse';
}



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.personal.reminders.server.proto.BillProto.prototype.toObject = function(opt_includeInstance) {
  return proto.personal.reminders.server.proto.BillProto.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.personal.reminders.server.proto.BillProto} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.personal.reminders.server.proto.BillProto.toObject = function(includeInstance, msg) {
  var f, obj = {
    id: jspb.Message.getFieldWithDefault(msg, 1, 0),
    service: jspb.Message.getFieldWithDefault(msg, 2, ""),
    providerurl: jspb.Message.getFieldWithDefault(msg, 3, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.personal.reminders.server.proto.BillProto}
 */
proto.personal.reminders.server.proto.BillProto.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.personal.reminders.server.proto.BillProto;
  return proto.personal.reminders.server.proto.BillProto.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.personal.reminders.server.proto.BillProto} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.personal.reminders.server.proto.BillProto}
 */
proto.personal.reminders.server.proto.BillProto.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {number} */ (reader.readInt32());
      msg.setId(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setService(value);
      break;
    case 3:
      var value = /** @type {string} */ (reader.readString());
      msg.setProviderurl(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.personal.reminders.server.proto.BillProto.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.personal.reminders.server.proto.BillProto.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.personal.reminders.server.proto.BillProto} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.personal.reminders.server.proto.BillProto.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getId();
  if (f !== 0) {
    writer.writeInt32(
      1,
      f
    );
  }
  f = message.getService();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
  f = message.getProviderurl();
  if (f.length > 0) {
    writer.writeString(
      3,
      f
    );
  }
};


/**
 * optional int32 id = 1;
 * @return {number}
 */
proto.personal.reminders.server.proto.BillProto.prototype.getId = function() {
  return /** @type {number} */ (jspb.Message.getFieldWithDefault(this, 1, 0));
};


/**
 * @param {number} value
 * @return {!proto.personal.reminders.server.proto.BillProto} returns this
 */
proto.personal.reminders.server.proto.BillProto.prototype.setId = function(value) {
  return jspb.Message.setProto3IntField(this, 1, value);
};


/**
 * optional string service = 2;
 * @return {string}
 */
proto.personal.reminders.server.proto.BillProto.prototype.getService = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.personal.reminders.server.proto.BillProto} returns this
 */
proto.personal.reminders.server.proto.BillProto.prototype.setService = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};


/**
 * optional string providerURL = 3;
 * @return {string}
 */
proto.personal.reminders.server.proto.BillProto.prototype.getProviderurl = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 3, ""));
};


/**
 * @param {string} value
 * @return {!proto.personal.reminders.server.proto.BillProto} returns this
 */
proto.personal.reminders.server.proto.BillProto.prototype.setProviderurl = function(value) {
  return jspb.Message.setProto3StringField(this, 3, value);
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.personal.reminders.server.proto.BillRequest.prototype.toObject = function(opt_includeInstance) {
  return proto.personal.reminders.server.proto.BillRequest.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.personal.reminders.server.proto.BillRequest} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.personal.reminders.server.proto.BillRequest.toObject = function(includeInstance, msg) {
  var f, obj = {
    service: jspb.Message.getFieldWithDefault(msg, 1, ""),
    providerurl: jspb.Message.getFieldWithDefault(msg, 2, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.personal.reminders.server.proto.BillRequest}
 */
proto.personal.reminders.server.proto.BillRequest.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.personal.reminders.server.proto.BillRequest;
  return proto.personal.reminders.server.proto.BillRequest.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.personal.reminders.server.proto.BillRequest} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.personal.reminders.server.proto.BillRequest}
 */
proto.personal.reminders.server.proto.BillRequest.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setService(value);
      break;
    case 2:
      var value = /** @type {string} */ (reader.readString());
      msg.setProviderurl(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.personal.reminders.server.proto.BillRequest.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.personal.reminders.server.proto.BillRequest.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.personal.reminders.server.proto.BillRequest} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.personal.reminders.server.proto.BillRequest.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getService();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
  f = message.getProviderurl();
  if (f.length > 0) {
    writer.writeString(
      2,
      f
    );
  }
};


/**
 * optional string service = 1;
 * @return {string}
 */
proto.personal.reminders.server.proto.BillRequest.prototype.getService = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.personal.reminders.server.proto.BillRequest} returns this
 */
proto.personal.reminders.server.proto.BillRequest.prototype.setService = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};


/**
 * optional string providerURL = 2;
 * @return {string}
 */
proto.personal.reminders.server.proto.BillRequest.prototype.getProviderurl = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 2, ""));
};


/**
 * @param {string} value
 * @return {!proto.personal.reminders.server.proto.BillRequest} returns this
 */
proto.personal.reminders.server.proto.BillRequest.prototype.setProviderurl = function(value) {
  return jspb.Message.setProto3StringField(this, 2, value);
};





if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.personal.reminders.server.proto.BillResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.personal.reminders.server.proto.BillResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.personal.reminders.server.proto.BillResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.personal.reminders.server.proto.BillResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    message: jspb.Message.getFieldWithDefault(msg, 1, "")
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.personal.reminders.server.proto.BillResponse}
 */
proto.personal.reminders.server.proto.BillResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.personal.reminders.server.proto.BillResponse;
  return proto.personal.reminders.server.proto.BillResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.personal.reminders.server.proto.BillResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.personal.reminders.server.proto.BillResponse}
 */
proto.personal.reminders.server.proto.BillResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = /** @type {string} */ (reader.readString());
      msg.setMessage(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.personal.reminders.server.proto.BillResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.personal.reminders.server.proto.BillResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.personal.reminders.server.proto.BillResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.personal.reminders.server.proto.BillResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getMessage();
  if (f.length > 0) {
    writer.writeString(
      1,
      f
    );
  }
};


/**
 * optional string message = 1;
 * @return {string}
 */
proto.personal.reminders.server.proto.BillResponse.prototype.getMessage = function() {
  return /** @type {string} */ (jspb.Message.getFieldWithDefault(this, 1, ""));
};


/**
 * @param {string} value
 * @return {!proto.personal.reminders.server.proto.BillResponse} returns this
 */
proto.personal.reminders.server.proto.BillResponse.prototype.setMessage = function(value) {
  return jspb.Message.setProto3StringField(this, 1, value);
};



/**
 * List of repeated fields within this message type.
 * @private {!Array<number>}
 * @const
 */
proto.personal.reminders.server.proto.ListBillsResponse.repeatedFields_ = [1];



if (jspb.Message.GENERATE_TO_OBJECT) {
/**
 * Creates an object representation of this proto.
 * Field names that are reserved in JavaScript and will be renamed to pb_name.
 * Optional fields that are not set will be set to undefined.
 * To access a reserved field use, foo.pb_<name>, eg, foo.pb_default.
 * For the list of reserved names please see:
 *     net/proto2/compiler/js/internal/generator.cc#kKeyword.
 * @param {boolean=} opt_includeInstance Deprecated. whether to include the
 *     JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @return {!Object}
 */
proto.personal.reminders.server.proto.ListBillsResponse.prototype.toObject = function(opt_includeInstance) {
  return proto.personal.reminders.server.proto.ListBillsResponse.toObject(opt_includeInstance, this);
};


/**
 * Static version of the {@see toObject} method.
 * @param {boolean|undefined} includeInstance Deprecated. Whether to include
 *     the JSPB instance for transitional soy proto support:
 *     http://goto/soy-param-migration
 * @param {!proto.personal.reminders.server.proto.ListBillsResponse} msg The msg instance to transform.
 * @return {!Object}
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.personal.reminders.server.proto.ListBillsResponse.toObject = function(includeInstance, msg) {
  var f, obj = {
    billsList: jspb.Message.toObjectList(msg.getBillsList(),
    proto.personal.reminders.server.proto.BillProto.toObject, includeInstance)
  };

  if (includeInstance) {
    obj.$jspbMessageInstance = msg;
  }
  return obj;
};
}


/**
 * Deserializes binary data (in protobuf wire format).
 * @param {jspb.ByteSource} bytes The bytes to deserialize.
 * @return {!proto.personal.reminders.server.proto.ListBillsResponse}
 */
proto.personal.reminders.server.proto.ListBillsResponse.deserializeBinary = function(bytes) {
  var reader = new jspb.BinaryReader(bytes);
  var msg = new proto.personal.reminders.server.proto.ListBillsResponse;
  return proto.personal.reminders.server.proto.ListBillsResponse.deserializeBinaryFromReader(msg, reader);
};


/**
 * Deserializes binary data (in protobuf wire format) from the
 * given reader into the given message object.
 * @param {!proto.personal.reminders.server.proto.ListBillsResponse} msg The message object to deserialize into.
 * @param {!jspb.BinaryReader} reader The BinaryReader to use.
 * @return {!proto.personal.reminders.server.proto.ListBillsResponse}
 */
proto.personal.reminders.server.proto.ListBillsResponse.deserializeBinaryFromReader = function(msg, reader) {
  while (reader.nextField()) {
    if (reader.isEndGroup()) {
      break;
    }
    var field = reader.getFieldNumber();
    switch (field) {
    case 1:
      var value = new proto.personal.reminders.server.proto.BillProto;
      reader.readMessage(value,proto.personal.reminders.server.proto.BillProto.deserializeBinaryFromReader);
      msg.addBills(value);
      break;
    default:
      reader.skipField();
      break;
    }
  }
  return msg;
};


/**
 * Serializes the message to binary data (in protobuf wire format).
 * @return {!Uint8Array}
 */
proto.personal.reminders.server.proto.ListBillsResponse.prototype.serializeBinary = function() {
  var writer = new jspb.BinaryWriter();
  proto.personal.reminders.server.proto.ListBillsResponse.serializeBinaryToWriter(this, writer);
  return writer.getResultBuffer();
};


/**
 * Serializes the given message to binary data (in protobuf wire
 * format), writing to the given BinaryWriter.
 * @param {!proto.personal.reminders.server.proto.ListBillsResponse} message
 * @param {!jspb.BinaryWriter} writer
 * @suppress {unusedLocalVariables} f is only used for nested messages
 */
proto.personal.reminders.server.proto.ListBillsResponse.serializeBinaryToWriter = function(message, writer) {
  var f = undefined;
  f = message.getBillsList();
  if (f.length > 0) {
    writer.writeRepeatedMessage(
      1,
      f,
      proto.personal.reminders.server.proto.BillProto.serializeBinaryToWriter
    );
  }
};


/**
 * repeated BillProto bills = 1;
 * @return {!Array<!proto.personal.reminders.server.proto.BillProto>}
 */
proto.personal.reminders.server.proto.ListBillsResponse.prototype.getBillsList = function() {
  return /** @type{!Array<!proto.personal.reminders.server.proto.BillProto>} */ (
    jspb.Message.getRepeatedWrapperField(this, proto.personal.reminders.server.proto.BillProto, 1));
};


/**
 * @param {!Array<!proto.personal.reminders.server.proto.BillProto>} value
 * @return {!proto.personal.reminders.server.proto.ListBillsResponse} returns this
*/
proto.personal.reminders.server.proto.ListBillsResponse.prototype.setBillsList = function(value) {
  return jspb.Message.setRepeatedWrapperField(this, 1, value);
};


/**
 * @param {!proto.personal.reminders.server.proto.BillProto=} opt_value
 * @param {number=} opt_index
 * @return {!proto.personal.reminders.server.proto.BillProto}
 */
proto.personal.reminders.server.proto.ListBillsResponse.prototype.addBills = function(opt_value, opt_index) {
  return jspb.Message.addToRepeatedWrapperField(this, 1, opt_value, proto.personal.reminders.server.proto.BillProto, opt_index);
};


/**
 * Clears the list making it empty but non-null.
 * @return {!proto.personal.reminders.server.proto.ListBillsResponse} returns this
 */
proto.personal.reminders.server.proto.ListBillsResponse.prototype.clearBillsList = function() {
  return this.setBillsList([]);
};


goog.object.extend(exports, proto.personal.reminders.server.proto);