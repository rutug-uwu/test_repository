package api.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetUserAccountsResponse extends BaseModel {
    private int id;
    private String accountNumber;
    private double balance;
    private List<Integer> transactions;
}
