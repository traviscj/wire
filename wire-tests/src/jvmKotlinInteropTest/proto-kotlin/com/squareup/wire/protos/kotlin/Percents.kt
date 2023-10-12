// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.Percents in percents_in_kdoc.proto
package com.squareup.wire.protos.kotlin

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmSynthetic
import okio.ByteString

public class Percents(
  /**
   * e.g. "No limits, free to send and just 2.75% to receive".
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 0,
  )
  @JvmField
  public val text: String? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<Percents, Percents.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.text = text
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is Percents) return false
    if (unknownFields != other.unknownFields) return false
    if (text != other.text) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (text?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (text != null) result += """text=${sanitize(text)}"""
    return result.joinToString(prefix = "Percents{", separator = ", ", postfix = "}")
  }

  public fun copy(text: String? = this.text, unknownFields: ByteString = this.unknownFields):
      Percents = Percents(text, unknownFields)

  public class Builder : Message.Builder<Percents, Builder>() {
    @JvmField
    public var text: String? = null

    /**
     * e.g. "No limits, free to send and just 2.75% to receive".
     */
    public fun text(text: String?): Builder {
      this.text = text
      return this
    }

    override fun build(): Percents = Percents(
      text = text,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<Percents> = object : ProtoAdapter<Percents>(
      FieldEncoding.LENGTH_DELIMITED, 
      Percents::class, 
      "type.googleapis.com/squareup.protos.kotlin.Percents", 
      PROTO_2, 
      null, 
      "percents_in_kdoc.proto"
    ) {
      override fun encodedSize(`value`: Percents): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.text)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: Percents) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: Percents) {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.text)
      }

      override fun decode(reader: ProtoReader): Percents {
        var text: String? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> text = ProtoAdapter.STRING.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return Percents(
          text = text,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: Percents): Percents = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): Percents = Builder().apply(body).build()
  }
}
