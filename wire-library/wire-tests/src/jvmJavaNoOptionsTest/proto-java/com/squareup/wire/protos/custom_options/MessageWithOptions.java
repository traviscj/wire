// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.custom_options.MessageWithOptions in custom_options.proto
package com.squareup.wire.protos.custom_options;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.Syntax;
import java.io.IOException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import okio.ByteString;

public final class MessageWithOptions extends Message<MessageWithOptions, MessageWithOptions.Builder> {
  public static final ProtoAdapter<MessageWithOptions> ADAPTER = new ProtoAdapter_MessageWithOptions();

  private static final long serialVersionUID = 0L;

  public MessageWithOptions() {
    this(ByteString.EMPTY);
  }

  public MessageWithOptions(ByteString unknownFields) {
    super(ADAPTER, unknownFields);
  }

  @Override
  public Builder newBuilder() {
    Builder builder = new Builder();
    builder.addUnknownFields(unknownFields());
    return builder;
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof MessageWithOptions)) return false;
    MessageWithOptions o = (MessageWithOptions) other;
    return unknownFields().equals(o.unknownFields());
  }

  @Override
  public int hashCode() {
    return unknownFields().hashCode();
  }

  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder();
    return builder.replace(0, 2, "MessageWithOptions{").append('}').toString();
  }

  public static final class Builder extends Message.Builder<MessageWithOptions, Builder> {
    public Builder() {
    }

    @Override
    public MessageWithOptions build() {
      return new MessageWithOptions(super.buildUnknownFields());
    }
  }

  private static final class ProtoAdapter_MessageWithOptions extends ProtoAdapter<MessageWithOptions> {
    public ProtoAdapter_MessageWithOptions() {
      super(FieldEncoding.LENGTH_DELIMITED, MessageWithOptions.class, "type.googleapis.com/squareup.protos.custom_options.MessageWithOptions", Syntax.PROTO_2);
    }

    @Override
    public int encodedSize(MessageWithOptions value) {
      int result = 0;
      result += value.unknownFields().size();
      return result;
    }

    @Override
    public void encode(ProtoWriter writer, MessageWithOptions value) throws IOException {
      writer.writeBytes(value.unknownFields());
    }

    @Override
    public MessageWithOptions decode(ProtoReader reader) throws IOException {
      Builder builder = new Builder();
      long token = reader.beginMessage();
      for (int tag; (tag = reader.nextTag()) != -1;) {
        switch (tag) {
          default: {
            reader.readUnknownField(tag);
          }
        }
      }
      builder.addUnknownFields(reader.endMessageAndGetUnknownFields(token));
      return builder.build();
    }

    @Override
    public MessageWithOptions redact(MessageWithOptions value) {
      Builder builder = value.newBuilder();
      builder.clearUnknownFields();
      return builder.build();
    }
  }
}
