//
// Name.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/** Model for testing model name same as property name */

<<<<<<< HEAD
@objc public class Name: NSObject, Codable { 
=======
@objc public class Name: NSObject, Codable {
>>>>>>> ooof

    public var name: Int
    public var snakeCase: Int?
    public var snakeCaseNum: NSNumber? {
        get {
            return snakeCase as NSNumber?
        }
    }
    public var property: String?
    public var _123number: Int?
    public var _123numberNum: NSNumber? {
        get {
            return _123number as NSNumber?
        }
    }

    public init(name: Int, snakeCase: Int?, property: String?, _123number: Int?) {
        self.name = name
        self.snakeCase = snakeCase
        self.property = property
        self._123number = _123number
    }

<<<<<<< HEAD
    public enum CodingKeys: String, CodingKey, CaseIterable { 
=======
    public enum CodingKeys: String, CodingKey, CaseIterable {
>>>>>>> ooof
        case name
        case snakeCase = "snake_case"
        case property
        case _123number = "123Number"
    }

}
