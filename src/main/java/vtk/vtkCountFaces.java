// java wrapper for vtkCountFaces object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCountFaces extends vtkPassInputTypeAlgorithm
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

  private native void SetOutputArrayName_4(byte[] id0, int len0);
  public void SetOutputArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOutputArrayName_4(bytes0, bytes0.length);
  }

  private native byte[] GetOutputArrayName_5();
  public String GetOutputArrayName()
  {
    return new String(GetOutputArrayName_5(), StandardCharsets.UTF_8);
  }

  private native void SetUseImplicitArray_6(boolean id0);
  public void SetUseImplicitArray(boolean id0)
  {
    SetUseImplicitArray_6(id0);
  }

  private native boolean GetUseImplicitArray_7();
  public boolean GetUseImplicitArray()
  {
    return GetUseImplicitArray_7();
  }

  public vtkCountFaces() { super(); }

  public vtkCountFaces(long id) { super(id); }
  public native long   VTKInit();

}
