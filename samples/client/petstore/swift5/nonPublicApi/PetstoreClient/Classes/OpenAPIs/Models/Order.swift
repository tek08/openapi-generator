//
// Order.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

<<<<<<< HEAD

internal struct Order: Codable { 

=======
internal struct Order: Codable {
>>>>>>> ooof

    internal enum Status: String, Codable, CaseIterable {
        case placed = "placed"
        case approved = "approved"
        case delivered = "delivered"
    }
    internal var id: Int64?
    internal var petId: Int64?
    internal var quantity: Int?
    internal var shipDate: Date?
    /** Order Status */
    internal var status: Status?
    internal var complete: Bool? = false

    internal init(id: Int64?, petId: Int64?, quantity: Int?, shipDate: Date?, status: Status?, complete: Bool?) {
        self.id = id
        self.petId = petId
        self.quantity = quantity
        self.shipDate = shipDate
        self.status = status
        self.complete = complete
    }

}
