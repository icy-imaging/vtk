// java wrapper for vtkTextureUnitManager object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTextureUnitManager extends vtkObject
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

  private native void Initialize_4();
  public void Initialize()
  {
    Initialize_4();
  }

  private native int GetNumberOfTextureUnits_5();
  public int GetNumberOfTextureUnits()
  {
    return GetNumberOfTextureUnits_5();
  }

  private native int Allocate_6();
  public int Allocate()
  {
    return Allocate_6();
  }

  private native int Allocate_7(int id0);
  public int Allocate(int id0)
  {
    return Allocate_7(id0);
  }

  private native boolean IsAllocated_8(int id0);
  public boolean IsAllocated(int id0)
  {
    return IsAllocated_8(id0);
  }

  private native void Free_9(int id0);
  public void Free(int id0)
  {
    Free_9(id0);
  }

  public vtkTextureUnitManager() { super(); }

  public vtkTextureUnitManager(long id) { super(id); }
  public native long   VTKInit();

}
