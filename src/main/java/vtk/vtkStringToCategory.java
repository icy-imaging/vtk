// java wrapper for vtkStringToCategory object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkStringToCategory extends vtkDataObjectAlgorithm
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

  private native void SetCategoryArrayName_4(byte[] id0, int len0);
  public void SetCategoryArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCategoryArrayName_4(bytes0, bytes0.length);
  }

  private native byte[] GetCategoryArrayName_5();
  public String GetCategoryArrayName()
  {
    return new String(GetCategoryArrayName_5(), StandardCharsets.UTF_8);
  }

  public vtkStringToCategory() { super(); }

  public vtkStringToCategory(long id) { super(id); }
  public native long   VTKInit();

}
