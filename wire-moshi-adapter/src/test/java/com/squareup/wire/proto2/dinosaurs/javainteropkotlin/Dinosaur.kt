// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.dinosaurs.javainteropkotlin.Dinosaur in dinosaur_java_interop_kotlin.proto
package com.squareup.wire.proto2.dinosaurs.javainteropkotlin

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
import com.squareup.wire.proto2.geology.javainteropkotlin.Period
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmSynthetic
import okio.ByteString

public class Dinosaur(
  /**
   * Common name of this dinosaur, like "Stegosaurus".
   */
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 0,
  )
  @JvmField
  public val name: String? = null,
  picture_urls: List<String> = emptyList(),
  @field:WireField(
    tag = 3,
    adapter = "com.squareup.wire.ProtoAdapter#DOUBLE",
    schemaIndex = 2,
  )
  @JvmField
  public val length_meters: Double? = null,
  @field:WireField(
    tag = 4,
    adapter = "com.squareup.wire.ProtoAdapter#DOUBLE",
    schemaIndex = 3,
  )
  @JvmField
  public val mass_kilograms: Double? = null,
  @field:WireField(
    tag = 5,
    adapter = "com.squareup.wire.proto2.geology.javainteropkotlin.Period#ADAPTER",
    schemaIndex = 4,
  )
  @JvmField
  public val period: Period? = null,
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<Dinosaur, Dinosaur.Builder>(ADAPTER, unknownFields) {
  /**
   * URLs with images of this dinosaur.
   */
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    label = WireField.Label.REPEATED,
    schemaIndex = 1,
  )
  @JvmField
  public val picture_urls: List<String> = immutableCopyOf("picture_urls", picture_urls)

  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.name = name
    builder.picture_urls = picture_urls
    builder.length_meters = length_meters
    builder.mass_kilograms = mass_kilograms
    builder.period = period
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is Dinosaur) return false
    if (unknownFields != other.unknownFields) return false
    if (name != other.name) return false
    if (picture_urls != other.picture_urls) return false
    if (length_meters != other.length_meters) return false
    if (mass_kilograms != other.mass_kilograms) return false
    if (period != other.period) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (name?.hashCode() ?: 0)
      result = result * 37 + picture_urls.hashCode()
      result = result * 37 + (length_meters?.hashCode() ?: 0)
      result = result * 37 + (mass_kilograms?.hashCode() ?: 0)
      result = result * 37 + (period?.hashCode() ?: 0)
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (name != null) result += """name=${sanitize(name)}"""
    if (picture_urls.isNotEmpty()) result += """picture_urls=${sanitize(picture_urls)}"""
    if (length_meters != null) result += """length_meters=$length_meters"""
    if (mass_kilograms != null) result += """mass_kilograms=$mass_kilograms"""
    if (period != null) result += """period=$period"""
    return result.joinToString(prefix = "Dinosaur{", separator = ", ", postfix = "}")
  }

  public fun copy(
    name: String? = this.name,
    picture_urls: List<String> = this.picture_urls,
    length_meters: Double? = this.length_meters,
    mass_kilograms: Double? = this.mass_kilograms,
    period: Period? = this.period,
    unknownFields: ByteString = this.unknownFields,
  ): Dinosaur = Dinosaur(name, picture_urls, length_meters, mass_kilograms, period, unknownFields)

  public class Builder : Message.Builder<Dinosaur, Builder>() {
    @JvmField
    public var name: String? = null

    @JvmField
    public var picture_urls: List<String> = emptyList()

    @JvmField
    public var length_meters: Double? = null

    @JvmField
    public var mass_kilograms: Double? = null

    @JvmField
    public var period: Period? = null

    /**
     * Common name of this dinosaur, like "Stegosaurus".
     */
    public fun name(name: String?): Builder {
      this.name = name
      return this
    }

    /**
     * URLs with images of this dinosaur.
     */
    public fun picture_urls(picture_urls: List<String>): Builder {
      checkElementsNotNull(picture_urls)
      this.picture_urls = picture_urls
      return this
    }

    public fun length_meters(length_meters: Double?): Builder {
      this.length_meters = length_meters
      return this
    }

    public fun mass_kilograms(mass_kilograms: Double?): Builder {
      this.mass_kilograms = mass_kilograms
      return this
    }

    public fun period(period: Period?): Builder {
      this.period = period
      return this
    }

    override fun build(): Dinosaur = Dinosaur(
      name = name,
      picture_urls = picture_urls,
      length_meters = length_meters,
      mass_kilograms = mass_kilograms,
      period = period,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<Dinosaur> = object : ProtoAdapter<Dinosaur>(
      FieldEncoding.LENGTH_DELIMITED, 
      Dinosaur::class, 
      "type.googleapis.com/squareup.dinosaurs.javainteropkotlin.Dinosaur", 
      PROTO_2, 
      null, 
      "dinosaur_java_interop_kotlin.proto"
    ) {
      override fun encodedSize(`value`: Dinosaur): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.name)
        size += ProtoAdapter.STRING.asRepeated().encodedSizeWithTag(2, value.picture_urls)
        size += ProtoAdapter.DOUBLE.encodedSizeWithTag(3, value.length_meters)
        size += ProtoAdapter.DOUBLE.encodedSizeWithTag(4, value.mass_kilograms)
        size += Period.ADAPTER.encodedSizeWithTag(5, value.period)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: Dinosaur) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, value.picture_urls)
        ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, value.length_meters)
        ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, value.mass_kilograms)
        Period.ADAPTER.encodeWithTag(writer, 5, value.period)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: Dinosaur) {
        writer.writeBytes(value.unknownFields)
        Period.ADAPTER.encodeWithTag(writer, 5, value.period)
        ProtoAdapter.DOUBLE.encodeWithTag(writer, 4, value.mass_kilograms)
        ProtoAdapter.DOUBLE.encodeWithTag(writer, 3, value.length_meters)
        ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 2, value.picture_urls)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
      }

      override fun decode(reader: ProtoReader): Dinosaur {
        var name: String? = null
        val picture_urls = mutableListOf<String>()
        var length_meters: Double? = null
        var mass_kilograms: Double? = null
        var period: Period? = null
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> name = ProtoAdapter.STRING.decode(reader)
            2 -> picture_urls.add(ProtoAdapter.STRING.decode(reader))
            3 -> length_meters = ProtoAdapter.DOUBLE.decode(reader)
            4 -> mass_kilograms = ProtoAdapter.DOUBLE.decode(reader)
            5 -> try {
              period = Period.ADAPTER.decode(reader)
            } catch (e: ProtoAdapter.EnumConstantNotFoundException) {
              reader.addUnknownField(tag, FieldEncoding.VARINT, e.value.toLong())
            }
            else -> reader.readUnknownField(tag)
          }
        }
        return Dinosaur(
          name = name,
          picture_urls = picture_urls,
          length_meters = length_meters,
          mass_kilograms = mass_kilograms,
          period = period,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: Dinosaur): Dinosaur = value.copy(
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): Dinosaur = Builder().apply(body).build()
  }
}
