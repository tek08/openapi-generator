/*
 * OpenAPI Petstore
 *
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package petstore

import (
	"encoding/json"
)

// InlineObject2 struct for InlineObject2
type InlineObject2 struct {
	// Form parameter enum test (string array)
	EnumFormStringArray *[]string `json:"enum_form_string_array,omitempty"`
	// Form parameter enum test (string)
	EnumFormString *string `json:"enum_form_string,omitempty"`
}

// NewInlineObject2 instantiates a new InlineObject2 object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewInlineObject2() *InlineObject2 {
	this := InlineObject2{}
	var enumFormString string = "-efg"
	this.EnumFormString = &enumFormString
	return &this
}

// NewInlineObject2WithDefaults instantiates a new InlineObject2 object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewInlineObject2WithDefaults() *InlineObject2 {
	this := InlineObject2{}
	var enumFormString string = "-efg"
	this.EnumFormString = &enumFormString
	return &this
}

// GetEnumFormStringArray returns the EnumFormStringArray field value if set, zero value otherwise.
func (o *InlineObject2) GetEnumFormStringArray() []string {
	if o == nil || o.EnumFormStringArray == nil {
		var ret []string
		return ret
	}
	return *o.EnumFormStringArray
}

// GetEnumFormStringArrayOk returns a tuple with the EnumFormStringArray field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InlineObject2) GetEnumFormStringArrayOk() (*[]string, bool) {
	if o == nil || o.EnumFormStringArray == nil {
		return nil, false
	}
	return o.EnumFormStringArray, true
}

// HasEnumFormStringArray returns a boolean if a field has been set.
func (o *InlineObject2) HasEnumFormStringArray() bool {
	if o != nil && o.EnumFormStringArray != nil {
		return true
	}

	return false
}

// SetEnumFormStringArray gets a reference to the given []string and assigns it to the EnumFormStringArray field.
func (o *InlineObject2) SetEnumFormStringArray(v []string) {
	o.EnumFormStringArray = &v
}

// GetEnumFormString returns the EnumFormString field value if set, zero value otherwise.
func (o *InlineObject2) GetEnumFormString() string {
	if o == nil || o.EnumFormString == nil {
		var ret string
		return ret
	}
	return *o.EnumFormString
}

// GetEnumFormStringOk returns a tuple with the EnumFormString field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *InlineObject2) GetEnumFormStringOk() (*string, bool) {
	if o == nil || o.EnumFormString == nil {
		return nil, false
	}
	return o.EnumFormString, true
}

// HasEnumFormString returns a boolean if a field has been set.
func (o *InlineObject2) HasEnumFormString() bool {
	if o != nil && o.EnumFormString != nil {
		return true
	}

	return false
}

// SetEnumFormString gets a reference to the given string and assigns it to the EnumFormString field.
func (o *InlineObject2) SetEnumFormString(v string) {
	o.EnumFormString = &v
}

func (o InlineObject2) MarshalJSON() ([]byte, error) {
	toSerialize := map[string]interface{}{}
	if o.EnumFormStringArray != nil {
		toSerialize["enum_form_string_array"] = o.EnumFormStringArray
	}
	if o.EnumFormString != nil {
		toSerialize["enum_form_string"] = o.EnumFormString
	}
	return json.Marshal(toSerialize)
}

type NullableInlineObject2 struct {
	value *InlineObject2
	isSet bool
}

func (v NullableInlineObject2) Get() *InlineObject2 {
	return v.value
}

func (v *NullableInlineObject2) Set(val *InlineObject2) {
	v.value = val
	v.isSet = true
}

func (v NullableInlineObject2) IsSet() bool {
	return v.isSet
}

func (v *NullableInlineObject2) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableInlineObject2(val *InlineObject2) *NullableInlineObject2 {
	return &NullableInlineObject2{value: val, isSet: true}
}

func (v NullableInlineObject2) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableInlineObject2) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}

<<<<<<< HEAD

=======
>>>>>>> ooof
