import React, { useContext, useState, useEffect } from "react";

import { Form, Modal, Button, Header, Dropdown } from "semantic-ui-react";

import Context from "../config/context";

export default function AddProductForm() {
  const context = useContext(Context);
  const { categories, getCategories, addProduct } = context;

  useEffect(() => {
    getCategories();
  }, []);

  const listCategories = categories.map(category => ({
    key: category.id,
    text: category.name,
    value: category.id
  }));

  const [name, setName] = useState("");
  const [description, setDescription] = useState("");
  const [category, setCategory] = useState("");
  const [price, setPrice] = useState("");
  const [weight, setWeight] = useState("");
  const [picture1, setPicture1] = useState("");
  const [picture2, setPicture2] = useState("");
  const [picture3, setPicture3] = useState("");

  const handleChange1 = (e, { value }) => setName({ value });
  const handleChange2 = (e, { value }) => setDescription({ value });
  const handleChange3 = (e, { value }) => setCategory({ value });
  const handleChange4 = (e, { value }) => setPrice({ value });
  const handleChange5 = (e, { value }) => setWeight({ value });
  const handleChange6 = (e, { value }) => setPicture1({ value });
  const handleChange7 = (e, { value }) => setPicture2({ value });
  const handleChange8 = (e, { value }) => setPicture3({ value });

  const handleSubmit = () => {
    const pictures = [picture1.value, picture2.value, picture3.value];

    const product = {
      name: name.value,
      description: description.value,
      category_id: parseInt(category.value),
      price: parseFloat(price.value),
