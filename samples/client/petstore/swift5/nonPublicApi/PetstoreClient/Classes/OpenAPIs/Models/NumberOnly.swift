//
// NumberOnly.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

<<<<<<< HEAD

internal struct NumberOnly: Codable { 

=======
internal struct NumberOnly: Codable {
>>>>>>> ooof

    internal var justNumber: Double?

    internal init(justNumber: Double?) {
        self.justNumber = justNumber
    }

<<<<<<< HEAD
    internal enum CodingKeys: String, CodingKey, CaseIterable { 
=======
    internal enum CodingKeys: String, CodingKey, CaseIterable {
>>>>>>> ooof
        case justNumber = "JustNumber"
    }

}
