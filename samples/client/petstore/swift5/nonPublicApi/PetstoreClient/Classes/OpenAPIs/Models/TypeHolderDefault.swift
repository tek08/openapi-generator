//
// TypeHolderDefault.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

<<<<<<< HEAD

internal struct TypeHolderDefault: Codable { 

=======
internal struct TypeHolderDefault: Codable {
>>>>>>> ooof

    internal var stringItem: String = "what"
    internal var numberItem: Double
    internal var integerItem: Int
    internal var boolItem: Bool = true
    internal var arrayItem: [Int]

    internal init(stringItem: String, numberItem: Double, integerItem: Int, boolItem: Bool, arrayItem: [Int]) {
        self.stringItem = stringItem
        self.numberItem = numberItem
        self.integerItem = integerItem
        self.boolItem = boolItem
        self.arrayItem = arrayItem
    }

<<<<<<< HEAD
    internal enum CodingKeys: String, CodingKey, CaseIterable { 
=======
    internal enum CodingKeys: String, CodingKey, CaseIterable {
>>>>>>> ooof
        case stringItem = "string_item"
        case numberItem = "number_item"
        case integerItem = "integer_item"
        case boolItem = "bool_item"
        case arrayItem = "array_item"
    }

}
