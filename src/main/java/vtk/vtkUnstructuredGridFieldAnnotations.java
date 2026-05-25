// java wrapper for vtkUnstructuredGridFieldAnnotations object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkUnstructuredGridFieldAnnotations extends vtkObject
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

  private native void FetchAnnotations_4(vtkFieldData id0,vtkDataAssembly id1);
  public void FetchAnnotations(vtkFieldData id0,vtkDataAssembly id1)
  {
    FetchAnnotations_4(id0,id1);
  }

  private native void AddAnnotations_5(vtkFieldData id0,vtkDataAssembly id1);
  public void AddAnnotations(vtkFieldData id0,vtkDataAssembly id1)
  {
    AddAnnotations_5(id0,id1);
  }

  private native void Reset_6();
  public void Reset()
  {
    Reset_6();
  }

  public vtkUnstructuredGridFieldAnnotations() { super(); }

  public vtkUnstructuredGridFieldAnnotations(long id) { super(id); }
  public native long   VTKInit();

}
