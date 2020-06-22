/*
 * OpenAPI Petstore
 *
 * This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
 *
 * API version: 1.0.0
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package petstoreserver

import (
	"encoding/json"
	"net/http"
	"strings"

	"github.com/gorilla/mux"
)

// A UserApiController binds http requests to an api service and writes the service results to the http response
type UserApiController struct {
	service UserApiServicer
}

// NewUserApiController creates a default api controller
func NewUserApiController(s UserApiServicer) Router {
	return &UserApiController{ service: s }
}

// Routes returns all of the api route for the UserApiController
func (c *UserApiController) Routes() Routes {
	return Routes{ 
		{
			"CreateUser",
			strings.ToUpper("Post"),
			"/v2/user",
			c.CreateUser,
		},
		{
			"CreateUsersWithArrayInput",
			strings.ToUpper("Post"),
			"/v2/user/createWithArray",
			c.CreateUsersWithArrayInput,
		},
		{
			"CreateUsersWithListInput",
			strings.ToUpper("Post"),
			"/v2/user/createWithList",
			c.CreateUsersWithListInput,
		},
		{
			"DeleteUser",
			strings.ToUpper("Delete"),
			"/v2/user/{username}",
			c.DeleteUser,
		},
		{
			"GetUserByName",
			strings.ToUpper("Get"),
			"/v2/user/{username}",
			c.GetUserByName,
		},
		{
			"LoginUser",
			strings.ToUpper("Get"),
			"/v2/user/login",
			c.LoginUser,
		},
		{
			"LogoutUser",
			strings.ToUpper("Get"),
			"/v2/user/logout",
			c.LogoutUser,
		},
		{
			"UpdateUser",
			strings.ToUpper("Put"),
			"/v2/user/{username}",
			c.UpdateUser,
		},
	}
}

// CreateUser - Create user
func (c *UserApiController) CreateUser(w http.ResponseWriter, r *http.Request) { 
<<<<<<< HEAD
	user := &User{}
	if err := json.NewDecoder(r.Body).Decode(&user); err != nil {
=======
	body := &User{}
	if err := json.NewDecoder(r.Body).Decode(&body); err != nil {
>>>>>>> ooof
		w.WriteHeader(500)
		return
	}
	
<<<<<<< HEAD
	result, err := c.service.CreateUser(*user)
=======
	result, err := c.service.CreateUser(*body)
>>>>>>> ooof
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// CreateUsersWithArrayInput - Creates list of users with given input array
func (c *UserApiController) CreateUsersWithArrayInput(w http.ResponseWriter, r *http.Request) { 
<<<<<<< HEAD
	user := &[]User{}
	if err := json.NewDecoder(r.Body).Decode(&user); err != nil {
=======
	body := &[]User{}
	if err := json.NewDecoder(r.Body).Decode(&body); err != nil {
>>>>>>> ooof
		w.WriteHeader(500)
		return
	}
	
<<<<<<< HEAD
	result, err := c.service.CreateUsersWithArrayInput(*user)
=======
	result, err := c.service.CreateUsersWithArrayInput(*body)
>>>>>>> ooof
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// CreateUsersWithListInput - Creates list of users with given input array
func (c *UserApiController) CreateUsersWithListInput(w http.ResponseWriter, r *http.Request) { 
<<<<<<< HEAD
	user := &[]User{}
	if err := json.NewDecoder(r.Body).Decode(&user); err != nil {
=======
	body := &[]User{}
	if err := json.NewDecoder(r.Body).Decode(&body); err != nil {
>>>>>>> ooof
		w.WriteHeader(500)
		return
	}
	
<<<<<<< HEAD
	result, err := c.service.CreateUsersWithListInput(*user)
=======
	result, err := c.service.CreateUsersWithListInput(*body)
>>>>>>> ooof
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// DeleteUser - Delete user
func (c *UserApiController) DeleteUser(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	username := params["username"]
	result, err := c.service.DeleteUser(username)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// GetUserByName - Get user by user name
func (c *UserApiController) GetUserByName(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	username := params["username"]
	result, err := c.service.GetUserByName(username)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// LoginUser - Logs user into the system
func (c *UserApiController) LoginUser(w http.ResponseWriter, r *http.Request) { 
	query := r.URL.Query()
	username := query.Get("username")
	password := query.Get("password")
	result, err := c.service.LoginUser(username, password)
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// LogoutUser - Logs out current logged in user session
func (c *UserApiController) LogoutUser(w http.ResponseWriter, r *http.Request) { 
	result, err := c.service.LogoutUser()
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}

// UpdateUser - Updated user
func (c *UserApiController) UpdateUser(w http.ResponseWriter, r *http.Request) { 
	params := mux.Vars(r)
	username := params["username"]
<<<<<<< HEAD
	user := &User{}
	if err := json.NewDecoder(r.Body).Decode(&user); err != nil {
=======
	body := &User{}
	if err := json.NewDecoder(r.Body).Decode(&body); err != nil {
>>>>>>> ooof
		w.WriteHeader(500)
		return
	}
	
<<<<<<< HEAD
	result, err := c.service.UpdateUser(username, *user)
=======
	result, err := c.service.UpdateUser(username, *body)
>>>>>>> ooof
	if err != nil {
		w.WriteHeader(500)
		return
	}
	
	EncodeJSONResponse(result, nil, w)
}
