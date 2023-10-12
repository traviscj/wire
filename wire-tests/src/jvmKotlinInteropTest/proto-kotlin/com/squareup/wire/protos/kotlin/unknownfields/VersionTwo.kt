// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.unknownfields.VersionTwo in unknown_fields.proto
package com.squareup.wire.protos.kotlin.unknownfields

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
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmSynthetic
import okio.ByteString

public class VersionTwo(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    schemaIndex = 0,
  )
  @JvmField
  public val i: Int? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#INT32",
    schemaIndex = 1,
  )
  @JvmField
  public val v2_i: Int? = null,
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 2,
  )
  @JvmField
  public val v2_s: String? = null,
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#FIXED32",
    schemaIndex = 3,
  )
  @JvmField
  public val v2_f32: Int? = null,
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.ProtoAdapter#FIXED64",
    schemaIndex = 4,
  )
  @JvmField
  public val v2_f64: Long? = null,
  v2_rs: List<String> = emptyList(),
  @field:WireField(
    tag = 7,
    adapter = "com.squareup.wire.protos.kotlin.unknownfields.NestedVersionTwo#ADAPTER",
    schemaIndex = 6,
  )
  @JvmField
  public val obj: NestedVersionTwo? = null,
  @field:WireField(
    tag = 8,
    adapter = "com.squareup.wire.protos.kotlin.unknownfields.EnumVersionTwo#ADAPTER",
    schemaIndex = 7,
  )
  @JvmField
  public val en: EnumVersionTwo? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<VersionTwo, VersionTwo.Builder>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 6,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.REPEATED,
    schemaIndex = 5,
  )
  @JvmField
  public val v2_rs: List<String> = immutableCopyOf("v2_rs", v2_rs)

  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.i = i
    builder.v2_i = v2_i
    builder.v2_s = v2_s
    builder.v2_f32 = v2_f32
    builder.v2_f64 = v2_f64
    builder.v2_rs = v2_rs
    builder.obj = obj
    builder.en = en
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is VersionTwo) return false
    if (unknownFields != other.unknownFields) return false
    if (i != other.i) return false
    if (v2_i != other.v2_i) return false
    if (v2_s != other.v2_s) return false
    if (v2_f32 != other.v2_f32) return false
    if (v2_f64 != other.v2_f64) return false
    if (v2_rs != other.v2_rs) return false
    if (obj != other.obj) return false
    if (en != other.en) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (i?.hashCode() ?: 0)
      result = result * 37 + (v2_i?.hashCode() ?: 0)
      result = result * 37 + (v2_s?.hashCode() ?: 0)
      result = result * 37 + (v2_f32?.hashCode() ?: 0)
      result = result * 37 + (v2_f64?.hashCode() ?: 0)
      result = result * 37 + v2_rs.hashCode()
      result = result * 37 + (obj?.hashCode() ?: 0)
      result = result * 37 + (en?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (i != null) result += """i=$i"""
    if (v2_i != null) result += """v2_i=$v2_i"""
    if (v2_s != null) result += """v2_s=${sanitize(v2_s)}"""
    if (v2_f32 != null) result += """v2_f32=$v2_f32"""
    if (v2_f64 != null) result += """v2_f64=$v2_f64"""
    if (v2_rs.isNotEmpty()) result += """v2_rs=${sanitize(v2_rs)}"""
    if (obj != null) result += """obj=$obj"""
    if (en != null) result += """en=$en"""
    return result.joinToString(prefix = "VersionTwo{", separator = ", ", postfix = "}")
  }

  public fun copy(
    i: Int? = this.i,
    v2_i: Int? = this.v2_i,
    v2_s: String? = this.v2_s,
    v2_f32: Int? = this.v2_f32,
    v2_f64: Long? = this.v2_f64,
    v2_rs: List<String> = this.v2_rs,
    obj: NestedVersionTwo? = this.obj,
    en: EnumVersionTwo? = this.en,
    unknownFields: ByteString = this.unknownFields,
  ): VersionTwo = VersionTwo(i, v2_i, v2_s, v2_f32, v2_f64, v2_rs, obj, en, unknownFields)

  public class Builder : Message.Builder<VersionTwo, Builder>() {
    @JvmField
    public var i: Int? = null

    @JvmField
    public var v2_i: Int? = null

    @JvmField
    public var v2_s: String? = null

    @JvmField
    public var v2_f32: Int? = null

    @JvmField
    public var v2_f64: Long? = null

    @JvmField
    public var v2_rs: List<String> = emptyList()

    @JvmField
    public var obj: NestedVersionTwo? = null

    @JvmField
    public var en: EnumVersionTwo? = null

    public fun i(i: Int?): Builder {
      this.i = i
      return this
    }

    public fun v2_i(v2_i: Int?): Builder {
      this.v2_i = v2_i
      return this
    }

    public fun v2_s(v2_s: String?): Builder {
      this.v2_s = v2_s
      return this
    }

    public fun v2_f32(v2_f32: Int?): Builder {
      this.v2_f32 = v2_f32
      return this
    }

    public fun v2_f64(v2_f64: Long?): Builder {
      this.v2_f64 = v2_f64
      return this
    }

    public fun v2_rs(v2_rs: List<String>): Builder {
      checkElementsNotNull(v2_rs)
      this.v2_rs = v2_rs
      return this
    }

    public fun obj(obj: NestedVersionTwo?): Builder {
      this.obj = obj
      return this
    }

    public fun en(en: EnumVersionTwo?): Builder {
      this.en = en
      return this
    }

    override fun build(): VersionTwo = VersionTwo(
      i = i,
      v2_i = v2_i,
      v2_s = v2_s,
      v2_f32 = v2_f32,
      v2_f64 = v2_f64,
      v2_rs = v2_rs,
      obj = obj,
      en = en,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<VersionTwo> = object : ProtoAdapter<VersionTwo>(
      FieldEncoding.LENGTH_DELIMITED, 
      VersionTwo::class, 
      "type.googleapis.com/squareup.protos.kotlin.unknownfields.VersionTwo", 
      PROTO_2, 
      null, 
      "unknown_fields.proto"
    ) {
      override fun encodedSize(`value`: VersionTwo): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.INT32.encodedSizeWithTag(1, value.i)
        size += ProtoAdapter.INT32.encodedSizeWithTag(2, value.v2_i)
        size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.v2_s)
        size += ProtoAdapter.FIXED32.encodedSizeWithTag(4, value.v2_f32)
        size += ProtoAdapter.FIXED64.encodedSizeWithTag(5, value.v2_f64)
        size += ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(6, value.v2_rs)
        size += NestedVersionTwo.ADAPTER.encodedSizeWithTag(7, value.obj)
        size += EnumVersionTwo.ADAPTER.encodedSizeWithTag(8, value.en)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: VersionTwo) {
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.i)
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.v2_i)
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.v2_s)
        ProtoAdapter.FIXED32.encodeWithTag(writer, 4, value.v2_f32)
        ProtoAdapter.FIXED64.encodeWithTag(writer, 5, value.v2_f64)
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 6, value.v2_rs)
        NestedVersionTwo.ADAPTER.encodeWithTag(writer, 7, value.obj)
        EnumVersionTwo.ADAPTER.encodeWithTag(writer, 8, value.en)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: VersionTwo) {
        writer.writeBytes(value.unknownFields)
        EnumVersionTwo.ADAPTER.encodeWithTag(writer, 8, value.en)
        NestedVersionTwo.ADAPTER.encodeWithTag(writer, 7, value.obj)
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 6, value.v2_rs)
        ProtoAdapter.FIXED64.encodeWithTag(writer, 5, value.v2_f64)
        ProtoAdapter.FIXED32.encodeWithTag(writer, 4, value.v2_f32)
        ProtoAdapter.STRING.encodeWithTag(writer, 3, value.v2_s)
        ProtoAdapter.INT32.encodeWithTag(writer, 2, value.v2_i)
        ProtoAdapter.INT32.encodeWithTag(writer, 1, value.i)
      }

      override fun decode(reader: ProtoReader): VersionTwo {
        var i: Int? = null
        var v2_i: Int? = null
        var v2_s: String? = null
        var v2_f32: Int? = null
        var v2_f64: Long? = null
        val v2_rs = mutableListOf<String>()
        var obj: NestedVersionTwo? = null
        var en: EnumVersionTwo? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> i = ProtoAdapter.INT32.decode(reader)
            2 -> v2_i = ProtoAdapter.INT32.decode(reader)
            3 -> v2_s = ProtoAdapter.STRING.decode(reader)
            4 -> v2_f32 = ProtoAdapter.FIXED32.decode(reader)
            5 -> v2_f64 = ProtoAdapter.FIXED64.decode(reader)
            6 -> v2_rs.add(ProtoAdapter.STRING.decode(reader))
            7 -> obj = NestedVersionTwo.ADAPTER.decode(reader)
            8 -> try {
              en = EnumVersionTwo.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            else -> reader.readUnknownField(tag)
          }
        }
        return VersionTwo(
          i = i,
          v2_i = v2_i,
          v2_s = v2_s,
          v2_f32 = v2_f32,
          v2_f64 = v2_f64,
          v2_rs = v2_rs,
          obj = obj,
          en = en,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: VersionTwo): VersionTwo = value.copy(
        obj = value.obj?.let(NestedVersionTwo.ADAPTER::redact),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): VersionTwo = Builder().apply(body).build()
  }
}
