productForm.addEventListener("submit", async (e) => {
  e.preventDefault();
  const id = parseInt(document.getElementById("productId").value);
  const product = {
    id: id,
    name: document.getElementById("productName").value,
    category: document.getElementById("productCategory").value,
    price: parseFloat(document.getElementById("productPrice").value)
  };

  // PUT if exists, POST if new
  const existing = productsCache.find(p => p.id === id);
  if (existing) {
    await fetch(API_URL + '/' + id, {
      method: 'PUT',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(product)
    });
  } else {
    await fetch(API_URL, {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify(product)
    });
  }

  productForm.reset();
  modalTitle.innerText = "Add Product";
  productModal.hide();
  fetchProducts();
});
