<script>
export default {
  name: "addProduct",
  props: {
    msg: String,
  },
};
</script>

<template>
  <div class="hello">
    <h1>{{ msg }}</h1>
  </div>
  <div>
    <p>
      商品編號: {{ productid }}
      <input v-model="productid" placeholder="商品編號" />
    </p>
    <p>
      商品名稱: {{ productname }}
      <input v-model="productname" placeholder="商品名稱" />
    </p>
    <p>
      商品售價: {{ price }}
      <input v-model="price" placeholder="商品售價" />
    </p>
    <p>
      商品庫存: {{ quantity }}
      <input v-model="quantity" placeholder="商品庫存" />
    </p>
  </div>
</template>

<style scoped></style>
