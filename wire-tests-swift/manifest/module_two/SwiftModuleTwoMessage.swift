// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.swift_modules.SwiftModuleTwoMessage in swift_module_two.proto
import Foundation
import Wire
import module_one

public struct SwiftModuleTwoMessage {

    @ProtoDefaulted
    public var name: String?
    public var unknownFields: Foundation.Data = .init()

    public init(configure: (inout Self) -> Swift.Void = { _ in }) {
        configure(&self)
    }

}

#if WIRE_INCLUDE_MEMBERWISE_INITIALIZER
extension SwiftModuleTwoMessage {

    @_disfavoredOverload
    @available(*, deprecated)
    public init(name: Swift.String? = nil) {
        self._name.wrappedValue = name
    }

}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension SwiftModuleTwoMessage : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension SwiftModuleTwoMessage : Hashable {
}
#endif

#if swift(>=5.5)
extension SwiftModuleTwoMessage : Sendable {
}
#endif

extension SwiftModuleTwoMessage : ProtoDefaultedValue {

    public static var defaultedValue: SwiftModuleTwoMessage {
        SwiftModuleTwoMessage()
    }
}

extension SwiftModuleTwoMessage : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/squareup.protos.kotlin.swift_modules.SwiftModuleTwoMessage"
    }

}

extension SwiftModuleTwoMessage : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        var name: Swift.String? = nil

        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            case 1: name = try protoReader.decode(Swift.String.self)
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

        self._name.wrappedValue = name
    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        try protoWriter.encode(tag: 1, value: self.name)
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension SwiftModuleTwoMessage : Codable {

    public init(from decoder: Swift.Decoder) throws {
        let container = try decoder.container(keyedBy: Wire.StringLiteralCodingKeys.self)
        self._name.wrappedValue = try container.decodeIfPresent(Swift.String.self, forKey: "name")
    }

    public func encode(to encoder: Swift.Encoder) throws {
        var container = encoder.container(keyedBy: Wire.StringLiteralCodingKeys.self)

        try container.encodeIfPresent(self.name, forKey: "name")
    }

}
#endif

/**
 * Subtypes within SwiftModuleTwoMessage
 */
extension SwiftModuleTwoMessage {

    public struct NestedMessage {

        public var types: [module_one.SwiftModuleOneType] = []
        public var unknownFields: Foundation.Data = .init()

        public init(configure: (inout Self) -> Swift.Void = { _ in }) {
            configure(&self)
        }

    }

}

#if WIRE_INCLUDE_MEMBERWISE_INITIALIZER
extension SwiftModuleTwoMessage.NestedMessage {

    @_disfavoredOverload
    @available(*, deprecated)
    public init(types: [module_one.SwiftModuleOneType] = []) {
        self.types = types
    }

}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension SwiftModuleTwoMessage.NestedMessage : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension SwiftModuleTwoMessage.NestedMessage : Hashable {
}
#endif

#if swift(>=5.5)
extension SwiftModuleTwoMessage.NestedMessage : Sendable {
}
#endif

extension SwiftModuleTwoMessage.NestedMessage : ProtoDefaultedValue {

    public static var defaultedValue: SwiftModuleTwoMessage.NestedMessage {
        SwiftModuleTwoMessage.NestedMessage()
    }
}

extension SwiftModuleTwoMessage.NestedMessage : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/squareup.protos.kotlin.swift_modules.SwiftModuleTwoMessage.NestedMessage"
    }

}

extension SwiftModuleTwoMessage.NestedMessage : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        var types: [module_one.SwiftModuleOneType] = []

        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            case 2: try protoReader.decode(into: &types)
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

        self.types = types
    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        try protoWriter.encode(tag: 2, value: self.types)
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension SwiftModuleTwoMessage.NestedMessage : Codable {

    public init(from decoder: Swift.Decoder) throws {
        let container = try decoder.container(keyedBy: Wire.StringLiteralCodingKeys.self)
        self.types = try container.decodeProtoArray(module_one.SwiftModuleOneType.self, forKey: "types")
    }

    public func encode(to encoder: Swift.Encoder) throws {
        var container = encoder.container(keyedBy: Wire.StringLiteralCodingKeys.self)
        let includeDefaults = encoder.protoDefaultValuesEncodingStrategy == .include

        if includeDefaults || !self.types.isEmpty {
            try container.encodeProtoArray(self.types, forKey: "types")
        }
    }

}
#endif
