//
// Model200Response.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

/** Model for testing model name starting with number */
<<<<<<< HEAD
public struct Model200Response: Codable { 

=======
public struct Model200Response: Codable {
>>>>>>> ooof

    public var name: Int?
    public var _class: String?

    public init(name: Int?, _class: String?) {
        self.name = name
        self._class = _class
    }

<<<<<<< HEAD
    public enum CodingKeys: String, CodingKey, CaseIterable { 
=======
    public enum CodingKeys: String, CodingKey, CaseIterable {
>>>>>>> ooof
        case name
        case _class = "class"
    }

}
