// Code generated by Wire protocol buffer compiler, do not edit.
// Source: ModelEvaluation in recursive_map.proto
import com.squareup.wire.FieldEncoding
import com.squareup.wire.Message
import com.squareup.wire.ProtoAdapter
import com.squareup.wire.ProtoReader
import com.squareup.wire.ProtoWriter
import com.squareup.wire.ReverseProtoWriter
import com.squareup.wire.Syntax.PROTO_2
import com.squareup.wire.WireField
import com.squareup.wire.`internal`.JvmField
import com.squareup.wire.`internal`.immutableCopyOf
import com.squareup.wire.`internal`.redactElements
import com.squareup.wire.`internal`.sanitize
import kotlin.Any
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map
import kotlin.jvm.JvmSynthetic
import kotlin.lazy
import okio.ByteString

/**
 * Copyright 2020 Square Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
public class ModelEvaluation(
  @field:WireField(
    tag = 1,
    adapter = "com.squareup.wire.ProtoAdapter#STRING",
    schemaIndex = 0,
  )
  @JvmField
  public val name: String? = null,
  @field:WireField(
    tag = 2,
    adapter = "com.squareup.wire.ProtoAdapter#DOUBLE",
    schemaIndex = 1,
  )
  @JvmField
  public val score: Double? = null,
  models: Map<String, ModelEvaluation> = emptyMap(),
  unknownFields: ByteString = ByteString.EMPTY,
) : Message<ModelEvaluation, ModelEvaluation.Builder>(ADAPTER, unknownFields) {
  @field:WireField(
    tag = 3,
    keyAdapter = "com.squareup.wire.ProtoAdapter#STRING",
    adapter = "ModelEvaluation#ADAPTER",
    schemaIndex = 2,
  )
  @JvmField
  public val models: Map<String, ModelEvaluation> = immutableCopyOf("models", models)

  override fun newBuilder(): Builder {
    val builder = Builder()
    builder.name = name
    builder.score = score
    builder.models = models
    builder.addUnknownFields(unknownFields)
    return builder
  }

  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is ModelEvaluation) return false
    if (unknownFields != other.unknownFields) return false
    if (name != other.name) return false
    if (score != other.score) return false
    if (models != other.models) return false
    return true
  }

  override fun hashCode(): Int {
    var result = super.hashCode
    if (result == 0) {
      result = unknownFields.hashCode()
      result = result * 37 + (name?.hashCode() ?: 0)
      result = result * 37 + (score?.hashCode() ?: 0)
      result = result * 37 + models.hashCode()
      super.hashCode = result
    }
    return result
  }

  override fun toString(): String {
    val result = mutableListOf<String>()
    if (name != null) result += """name=${sanitize(name)}"""
    if (score != null) result += """score=$score"""
    if (models.isNotEmpty()) result += """models=$models"""
    return result.joinToString(prefix = "ModelEvaluation{", separator = ", ", postfix = "}")
  }

  public fun copy(
    name: String? = this.name,
    score: Double? = this.score,
    models: Map<String, ModelEvaluation> = this.models,
    unknownFields: ByteString = this.unknownFields,
  ): ModelEvaluation = ModelEvaluation(name, score, models, unknownFields)

  public class Builder : Message.Builder<ModelEvaluation, Builder>() {
    @JvmField
    public var name: String? = null

    @JvmField
    public var score: Double? = null

    @JvmField
    public var models: Map<String, ModelEvaluation> = emptyMap()

    public fun name(name: String?): Builder {
      this.name = name
      return this
    }

    public fun score(score: Double?): Builder {
      this.score = score
      return this
    }

    public fun models(models: Map<String, ModelEvaluation>): Builder {
      this.models = models
      return this
    }

    override fun build(): ModelEvaluation = ModelEvaluation(
      name = name,
      score = score,
      models = models,
      unknownFields = buildUnknownFields()
    )
  }

  public companion object {
    @JvmField
    public val ADAPTER: ProtoAdapter<ModelEvaluation> = object : ProtoAdapter<ModelEvaluation>(
      FieldEncoding.LENGTH_DELIMITED, 
      ModelEvaluation::class, 
      "type.googleapis.com/ModelEvaluation", 
      PROTO_2, 
      null, 
      "recursive_map.proto"
    ) {
      private val modelsAdapter: ProtoAdapter<Map<String, ModelEvaluation>> by lazy {
          ProtoAdapter.newMapAdapter(ProtoAdapter.STRING, ModelEvaluation.ADAPTER) }

      override fun encodedSize(`value`: ModelEvaluation): Int {
        var size = value.unknownFields.size
        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.name)
        size += ProtoAdapter.DOUBLE.encodedSizeWithTag(2, value.score)
        size += modelsAdapter.encodedSizeWithTag(3, value.models)
        return size
      }

      override fun encode(writer: ProtoWriter, `value`: ModelEvaluation) {
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
        ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, value.score)
        modelsAdapter.encodeWithTag(writer, 3, value.models)
        writer.writeBytes(value.unknownFields)
      }

      override fun encode(writer: ReverseProtoWriter, `value`: ModelEvaluation) {
        writer.writeBytes(value.unknownFields)
        modelsAdapter.encodeWithTag(writer, 3, value.models)
        ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, value.score)
        ProtoAdapter.STRING.encodeWithTag(writer, 1, value.name)
      }

      override fun decode(reader: ProtoReader): ModelEvaluation {
        var name: String? = null
        var score: Double? = null
        val models = mutableMapOf<String, ModelEvaluation>()
        val unknownFields = reader.forEachTag { tag ->
          when (tag) {
            1 -> name = ProtoAdapter.STRING.decode(reader)
            2 -> score = ProtoAdapter.DOUBLE.decode(reader)
            3 -> models.putAll(modelsAdapter.decode(reader))
            else -> reader.readUnknownField(tag)
          }
        }
        return ModelEvaluation(
          name = name,
          score = score,
          models = models,
          unknownFields = unknownFields
        )
      }

      override fun redact(`value`: ModelEvaluation): ModelEvaluation = value.copy(
        models = value.models.redactElements(ModelEvaluation.ADAPTER),
        unknownFields = ByteString.EMPTY
      )
    }

    private const val serialVersionUID: Long = 0L

    @JvmSynthetic
    public inline fun build(body: Builder.() -> Unit): ModelEvaluation =
        Builder().apply(body).build()
  }
}
