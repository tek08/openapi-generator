//
// EnumArrays.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

<<<<<<< HEAD

public struct EnumArrays: Codable { 

=======
public struct EnumArrays: Codable {
>>>>>>> ooof

    public enum JustSymbol: String, Codable, CaseIterable {
        case greaterThanOrEqualTo = ">="
        case dollar = "$"
    }
    public enum ArrayEnum: String, Codable, CaseIterable {
        case fish = "fish"
        case crab = "crab"
    }
    public private(set) var justSymbol: JustSymbol?
    public private(set) var arrayEnum: [ArrayEnum]?

    public init(justSymbol: JustSymbol?, arrayEnum: [ArrayEnum]?) {
        self.justSymbol = justSymbol
        self.arrayEnum = arrayEnum
    }

<<<<<<< HEAD
    public enum CodingKeys: String, CodingKey, CaseIterable { 
=======
    public enum CodingKeys: String, CodingKey, CaseIterable {
>>>>>>> ooof
        case justSymbol = "just_symbol"
        case arrayEnum = "array_enum"
    }

}
