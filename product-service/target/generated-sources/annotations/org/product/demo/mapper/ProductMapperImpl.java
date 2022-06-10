package org.product.demo.mapper;

import javax.annotation.Generated;
import org.product.demo.dto.ProductReqDTO;
import org.product.demo.dto.ProductResDTO;
import org.product.demo.model.Product;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-06-08T23:33:33+0100",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_111 (Oracle Corporation)"
)
@Component
public class ProductMapperImpl implements ProductMapper {

    @Override
    public ProductResDTO productToProductResDTO(Product product) {
        if ( product == null ) {
            return null;
        }

        ProductResDTO productResDTO = new ProductResDTO();

        productResDTO.setId( product.getId() );
        productResDTO.setLibele( product.getLibele() );
        productResDTO.setPrix( product.getPrix() );
        productResDTO.setQte( product.getQte() );
        productResDTO.setDate( product.getDate() );
        productResDTO.setDescription( product.getDescription() );

        return productResDTO;
    }

    @Override
    public Product productReqDTOProduct(ProductReqDTO productReqDTO) {
        if ( productReqDTO == null ) {
            return null;
        }

        Product product = new Product();

        product.setId( productReqDTO.getId() );
        product.setLibele( productReqDTO.getLibele() );
        product.setPrix( productReqDTO.getPrix() );
        product.setQte( productReqDTO.getQte() );
        product.setDate( productReqDTO.getDate() );
        product.setDescription( productReqDTO.getDescription() );

        return product;
    }
}
