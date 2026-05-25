// java wrapper for vtkCompositeDataProbeFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCompositeDataProbeFilter extends vtkProbeFilter
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

  private native void SetPassPartialArrays_4(boolean id0);
  public void SetPassPartialArrays(boolean id0)
  {
    SetPassPartialArrays_4(id0);
  }

  private native boolean GetPassPartialArrays_5();
  public boolean GetPassPartialArrays()
  {
    return GetPassPartialArrays_5();
  }

  private native void PassPartialArraysOn_6();
  public void PassPartialArraysOn()
  {
    PassPartialArraysOn_6();
  }

  private native void PassPartialArraysOff_7();
  public void PassPartialArraysOff()
  {
    PassPartialArraysOff_7();
  }

  private native void SetUseImplicitArrays_8(boolean id0);
  public void SetUseImplicitArrays(boolean id0)
  {
    SetUseImplicitArrays_8(id0);
  }

  private native boolean GetUseImplicitArrays_9();
  public boolean GetUseImplicitArrays()
  {
    return GetUseImplicitArrays_9();
  }

  private native void UseImplicitArraysOn_10();
  public void UseImplicitArraysOn()
  {
    UseImplicitArraysOn_10();
  }

  private native void UseImplicitArraysOff_11();
  public void UseImplicitArraysOff()
  {
    UseImplicitArraysOff_11();
  }

  public vtkCompositeDataProbeFilter() { super(); }

  public vtkCompositeDataProbeFilter(long id) { super(id); }
  public native long   VTKInit();

}
