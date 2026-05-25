// java wrapper for vtkSelector object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSelector extends vtkObject
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

  private native void Initialize_4(vtkSelectionNode id0);
  public void Initialize(vtkSelectionNode id0)
  {
    Initialize_4(id0);
  }

  private native void Finalize_5();
  public void Finalize()
  {
    Finalize_5();
  }

  private native void Execute_6(vtkDataObject id0,vtkDataObject id1);
  public void Execute(vtkDataObject id0,vtkDataObject id1)
  {
    Execute_6(id0,id1);
  }

  private native void SetInsidednessArrayName_7(byte[] id0, int len0);
  public void SetInsidednessArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInsidednessArrayName_7(bytes0, bytes0.length);
  }

  private native byte[] GetInsidednessArrayName_8();
  public String GetInsidednessArrayName()
  {
    return new String(GetInsidednessArrayName_8(), StandardCharsets.UTF_8);
  }

  public vtkSelector() { super(); }

  public vtkSelector(long id) { super(id); }

}
