// Code generated by Wire protocol buffer compiler, do not edit.
// Source: squareup.protos.kotlin.oneof.OneOfMessage in one_of.proto
import Foundation
import Wire

/**
 * It's a one of message.
 */
public struct OneOfMessage {

    /**
     * Must have a foo or a bar or a baz.
     */
    public var choice: OneOfMessage.Choice?
    public var unknownFields: Foundation.Data = .init()

    public init(configure: (inout Self) -> Swift.Void = { _ in }) {
        configure(&self)
    }

}

#if WIRE_INCLUDE_MEMBERWISE_INITIALIZER
extension OneOfMessage {

    @_disfavoredOverload
    @available(*, deprecated)
    public init(choice: Choice? = nil) {
        self.choice = choice
    }

}
#endif

#if !WIRE_REMOVE_EQUATABLE
extension OneOfMessage : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension OneOfMessage : Hashable {
}
#endif

#if swift(>=5.5)
extension OneOfMessage : Sendable {
}
#endif

extension OneOfMessage : ProtoDefaultedValue {

    public static var defaultedValue: OneOfMessage {
        OneOfMessage()
    }
}

extension OneOfMessage : ProtoMessage {

    public static func protoMessageTypeURL() -> Swift.String {
        return "type.googleapis.com/squareup.protos.kotlin.oneof.OneOfMessage"
    }

}

extension OneOfMessage : Proto2Codable {

    public init(from protoReader: Wire.ProtoReader) throws {
        var choice: Choice? = nil

        let token = try protoReader.beginMessage()
        while let tag = try protoReader.nextTag(token: token) {
            switch tag {
            case 1: choice = .foo(try protoReader.decode(Swift.Int32.self))
            case 3: choice = .bar(try protoReader.decode(Swift.String.self))
            case 4: choice = .baz(try protoReader.decode(Swift.String.self))
            default: try protoReader.readUnknownField(tag: tag)
            }
        }
        self.unknownFields = try protoReader.endMessage(token: token)

        self.choice = choice
    }

    public func encode(to protoWriter: Wire.ProtoWriter) throws {
        if let choice = self.choice {
            try choice.encode(to: protoWriter)
        }
        try protoWriter.writeUnknownFields(unknownFields)
    }

}

#if !WIRE_REMOVE_CODABLE
extension OneOfMessage : Codable {

    public init(from decoder: Swift.Decoder) throws {
        let container = try decoder.container(keyedBy: Wire.StringLiteralCodingKeys.self)
        if let foo = try container.decodeIfPresent(Swift.Int32.self, forKey: "foo") {
            self.choice = .foo(foo)
        } else if let bar = try container.decodeIfPresent(Swift.String.self, forKey: "bar") {
            self.choice = .bar(bar)
        } else if let baz = try container.decodeIfPresent(Swift.String.self, forKey: "baz") {
            self.choice = .baz(baz)
        } else {
            self.choice = nil
        }
    }

    public func encode(to encoder: Swift.Encoder) throws {
        var container = encoder.container(keyedBy: Wire.StringLiteralCodingKeys.self)

        switch self.choice {
        case .foo(let foo): try container.encode(foo, forKey: "foo")
        case .bar(let bar): try container.encode(bar, forKey: "bar")
        case .baz(let baz): try container.encode(baz, forKey: "baz")
        case Swift.Optional.none: break
        }
    }

}
#endif

/**
 * Subtypes within OneOfMessage
 */
extension OneOfMessage {

    public enum Choice {

        /**
         * What foo.
         */
        case foo(Swift.Int32)
        /**
         * Such bar.
         */
        case bar(Swift.String)
        /**
         * Nice baz.
         */
        case baz(Swift.String)

        fileprivate func encode(to protoWriter: Wire.ProtoWriter) throws {
            switch self {
            case .foo(let foo): try protoWriter.encode(tag: 1, value: foo)
            case .bar(let bar): try protoWriter.encode(tag: 3, value: bar)
            case .baz(let baz): try protoWriter.encode(tag: 4, value: baz)
            }
        }

    }

}

#if !WIRE_REMOVE_EQUATABLE
extension OneOfMessage.Choice : Equatable {
}
#endif

#if !WIRE_REMOVE_HASHABLE
extension OneOfMessage.Choice : Hashable {
}
#endif

#if swift(>=5.5)
extension OneOfMessage.Choice : Sendable {
}
#endif
