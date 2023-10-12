// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.packed_encoding.EmbeddedMessage in packed_encoding.proto
package squareup.protos.packed_encoding

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.checkElementsNotNull
import com.squareup.wire.`internal`.immutableCopyOf
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmSynthetic
import okio.ByteString

public class EmbeddedMessage(
  inner_repeated_number: List<Int> = emptyList(),
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    schemaIndex = 1,
  )
  @JvmField
  public val inner_number_after: Int? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<EmbeddedMessage, EmbeddedMessage.Builder>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    label = WireField.Label.PACKED,
    schemaIndex = 0,
  )
  @JvmField
  public val inner_repeated_number: List<Int> = immutableCopyOf("inner_repeated_number",
      inner_repeated_number)

  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.inner_repeated_number = inner_repeated_number
    builder.inner_number_after = inner_number_after
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is EmbeddedMessage) return false
    if (unknownFields != other.unknownFields) return false
    if (inner_repeated_number != other.inner_repeated_number) return false
    if (inner_number_after != other.inner_number_after) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + inner_repeated_number.hashCode()
      result = result * 37 + (inner_number_after?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (inner_repeated_number.isNotEmpty()) result +=
        """inner_repeated_number=$inner_repeated_number"""
    if (inner_number_after != null) result += """inner_number_after=$inner_number_after"""
    return result.joinToString(prefix = "EmbeddedMessage{", separator = ", ", postfix = "}")
  }

  public fun copy(
    inner_repeated_number: List<Int> = this.inner_repeated_number,
    inner_number_after: Int? = this.inner_number_after,
    unknownFields: ByteString = this.unknownFields,
  ): EmbeddedMessage = EmbeddedMessage(inner_repeated_number, inner_number_after, unknownFields)

  public class Builder : Message.Builder<EmbeddedMessage, Builder>() {
    @JvmField
    public var inner_repeated_number: List<Int> = emptyList()

    @JvmField
    public var inner_number_after: Int? = null

    public fun inner_repeated_number(inner_repeated_number: List<Int>): Builder {
      checkElementsNotNull(inner_repeated_number)
      this.inner_repeated_number = inner_repeated_number
      return this
    }

    public fun inner_number_after(inner_number_after: Int?): Builder {
      this.inner_number_after = inner_number_after
      return this
    }

    override fun build(): EmbeddedMessage = EmbeddedMessage(
      inner_repeated_number = inner_repeated_number,
      inner_number_after = inner_number_after,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<EmbeddedMessage> = object : ProtoAdapter<EmbeddedMessage>(
      FieldEncoding.LENGTH_DELIMITED, 
      EmbeddedMessage::class, 
      "type.googleapis.com/squareup.protos.packed_encoding.EmbeddedMessage", 
      PROTO_2, 
      null, 
      "packed_encoding.proto"
    ) {
      override fun encodedSize(`value`: EmbeddedMessage): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.INT32.asPacked().encodedSizeWithTag(1, value.inner_repeated_number)
        size += ProtoAdapter.INT32.encodedSizeWithTag(2, value.inner_number_after)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: EmbeddedMessage) {
        ProtoAdapter.INT32.asPacked().encodeWithTag(writer, 1, value.inner_repeated_number)
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.inner_number_after)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: EmbeddedMessage) {
        writer.writeBytes(value.unknownFields)
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.inner_number_after)
        ProtoAdapter.INT32.asPacked().encodeWithTag(writer, 1, value.inner_repeated_number)
      }

      override fun decode(reader: ProtoReader): EmbeddedMessage {
        var inner_repeated_number: MutableList<Int>? = null
        var inner_number_after: Int? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> {
              if (inner_repeated_number == null) {
                val minimumByteSize = 1
                val initialCapacity = (reader.nextFieldMinLengthInBytes() / minimumByteSize)
                  .coerceAtMost(Int.MAX_VALUE.toLong())
                  .toInt()
                inner_repeated_number = ArrayList(initialCapacity)
              }
              inner_repeated_number!!.add(ProtoAdapter.INT32.decode(reader))
            }
            2 -> inner_number_after = ProtoAdapter.INT32.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return EmbeddedMessage(
          inner_repeated_number = inner_repeated_number ?: listOf(),
          inner_number_after = inner_number_after,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: EmbeddedMessage): EmbeddedMessage = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): EmbeddedMessage =
        Builder().apply(body).build()
  }
}
