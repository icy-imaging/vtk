// java wrapper for vtkHyperTreeGridEvaluateCoarse object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridEvaluateCoarse extends vtkHyperTreeGridAlgorithm
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetOperator_4(int id0);
  public void SetOperator(int id0)
  {
    SetOperator_4(id0);
  }

  private native int GetOperator_5();
  public int GetOperator()
  {
    return GetOperator_5();
  }

  private native void SetDefault_6(double id0);
  public void SetDefault(double id0)
  {
    SetDefault_6(id0);
  }

  public vtkHyperTreeGridEvaluateCoarse() { super(); }

  public vtkHyperTreeGridEvaluateCoarse(long id) { super(id); }
  public native long   VTKInit();

}
