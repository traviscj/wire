// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.proto3.FreeGarlicBreadPromotion in pizza.proto
package squareup.proto3

import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_3
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmSynthetic
import okio.ByteString

public class FreeGarlicBreadPromotion(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#BOOL",
    label = WireField.Label.OMIT_IDENTITY,
    jsonName = "isExtraCheesey",
    schemaIndex = 0,
  )
  @JvmField
  public val is_extra_cheesey: Boolean = false,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<FreeGarlicBreadPromotion, FreeGarlicBreadPromotion.Builder>(ADAPTER, unknownFields) {
  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.is_extra_cheesey = is_extra_cheesey
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is FreeGarlicBreadPromotion) return false
    if (unknownFields != other.unknownFields) return false
    if (is_extra_cheesey != other.is_extra_cheesey) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + is_extra_cheesey.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    result += """is_extra_cheesey=$is_extra_cheesey"""
    return result.joinToString(prefix = "FreeGarlicBreadPromotion{", separator = ", ", postfix =
        "}")
  }

  public fun copy(is_extra_cheesey: Boolean = this.is_extra_cheesey, unknownFields: ByteString =
      this.unknownFields): FreeGarlicBreadPromotion = FreeGarlicBreadPromotion(is_extra_cheesey,
      unknownFields)

  public class Builder : Message.Builder<FreeGarlicBreadPromotion, Builder>() {
    @JvmField
    public var is_extra_cheesey: Boolean = false

    public fun is_extra_cheesey(is_extra_cheesey: Boolean): Builder {
      this.is_extra_cheesey = is_extra_cheesey
      return this
    }

    override fun build(): FreeGarlicBreadPromotion = FreeGarlicBreadPromotion(
      is_extra_cheesey = is_extra_cheesey,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<FreeGarlicBreadPromotion> = object :
        ProtoAdapter<FreeGarlicBreadPromotion>(
      FieldEncoding.LENGTH_DELIMITED, 
      FreeGarlicBreadPromotion::class, 
      "type.googleapis.com/squareup.proto3.FreeGarlicBreadPromotion", 
      PROTO_3, 
      null, 
      "pizza.proto"
    ) {
      override fun encodedSize(`value`: FreeGarlicBreadPromotion): Int {
        var size = value.unknownFields.size
        if (value.is_extra_cheesey != false) size += ProtoAdapter.BOOL.encodedSizeWithTag(1,
            value.is_extra_cheesey)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: FreeGarlicBreadPromotion) {
        if (value.is_extra_cheesey != false) ProtoAdapter.BOOL.encodeWithTag(writer, 1,
            value.is_extra_cheesey)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: FreeGarlicBreadPromotion) {
        writer.writeBytes(value.unknownFields)
        if (value.is_extra_cheesey != false) ProtoAdapter.BOOL.encodeWithTag(writer, 1,
            value.is_extra_cheesey)
      }

      override fun decode(reader: ProtoReader): FreeGarlicBreadPromotion {
        var is_extra_cheesey: Boolean = false
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> is_extra_cheesey = ProtoAdapter.BOOL.decode(reader)
            else -> reader.readUnknownField(tag)
          }
        }
        return FreeGarlicBreadPromotion(
          is_extra_cheesey = is_extra_cheesey,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: FreeGarlicBreadPromotion): FreeGarlicBreadPromotion = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): FreeGarlicBreadPromotion =
        Builder().apply(body).build()
  }
}
