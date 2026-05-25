// java wrapper for vtkTreeDifferenceFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTreeDifferenceFilter extends vtkGraphAlgorithm
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

  private native void SetIdArrayName_4(byte[] id0, int len0);
  public void SetIdArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetIdArrayName_4(bytes0, bytes0.length);
  }

  private native byte[] GetIdArrayName_5();
  public String GetIdArrayName()
  {
    return new String(GetIdArrayName_5(), StandardCharsets.UTF_8);
  }

  private native void SetComparisonArrayName_6(byte[] id0, int len0);
  public void SetComparisonArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetComparisonArrayName_6(bytes0, bytes0.length);
  }

  private native byte[] GetComparisonArrayName_7();
  public String GetComparisonArrayName()
  {
    return new String(GetComparisonArrayName_7(), StandardCharsets.UTF_8);
  }

  private native void SetOutputArrayName_8(byte[] id0, int len0);
  public void SetOutputArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOutputArrayName_8(bytes0, bytes0.length);
  }

  private native byte[] GetOutputArrayName_9();
  public String GetOutputArrayName()
  {
    return new String(GetOutputArrayName_9(), StandardCharsets.UTF_8);
  }

  private native void SetComparisonArrayIsVertexData_10(boolean id0);
  public void SetComparisonArrayIsVertexData(boolean id0)
  {
    SetComparisonArrayIsVertexData_10(id0);
  }

  private native boolean GetComparisonArrayIsVertexData_11();
  public boolean GetComparisonArrayIsVertexData()
  {
    return GetComparisonArrayIsVertexData_11();
  }

  public vtkTreeDifferenceFilter() { super(); }

  public vtkTreeDifferenceFilter(long id) { super(id); }
  public native long   VTKInit();

}
