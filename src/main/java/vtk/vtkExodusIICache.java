// java wrapper for vtkExodusIICache object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExodusIICache extends vtkObject
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

  private native void Clear_4();
  public void Clear()
  {
    Clear_4();
  }

  private native void SetCacheCapacity_5(double id0);
  public void SetCacheCapacity(double id0)
  {
    SetCacheCapacity_5(id0);
  }

  private native double GetSpaceLeft_6();
  public double GetSpaceLeft()
  {
    return GetSpaceLeft_6();
  }

  private native int ReduceToSize_7(double id0);
  public int ReduceToSize(double id0)
  {
    return ReduceToSize_7(id0);
  }

  public vtkExodusIICache() { super(); }

  public vtkExodusIICache(long id) { super(id); }
  public native long   VTKInit();

}
