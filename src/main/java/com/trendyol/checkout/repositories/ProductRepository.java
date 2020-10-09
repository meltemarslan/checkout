package com.trendyol.checkout.repositories;

import com.couchbase.client.java.Cluster;
import com.couchbase.client.java.Collection;
import com.couchbase.client.java.kv.GetResult;
import com.trendyol.checkout.domain.Product;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

    private final Cluster couchbaseCluster;
    private final Collection productCollection;

    public ProductRepository(Cluster couchbaseCluster, Collection productCollection) {
        this.couchbaseCluster = couchbaseCluster;
        this.productCollection = productCollection;
    }

    public Product findById(String id) {
        GetResult getResult = productCollection.get(id);
        Product product = getResult.contentAs(Product.class);
        return product;
    }

}
