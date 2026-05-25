// java wrapper for vtkHeap object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHeap extends vtkObject
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

  private native int GetNumberOfBlocks_4();
  public int GetNumberOfBlocks()
  {
    return GetNumberOfBlocks_4();
  }

  private native int GetNumberOfAllocations_5();
  public int GetNumberOfAllocations()
  {
    return GetNumberOfAllocations_5();
  }

  private native void Reset_6();
  public void Reset()
  {
    Reset_6();
  }

  private native byte[] StringDup_7(byte[] id0, int len0);
  public String StringDup(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return new String(StringDup_7(bytes0, bytes0.length), StandardCharsets.UTF_8);
  }

  public vtkHeap() { super(); }

  public vtkHeap(long id) { super(id); }
  public native long   VTKInit();

}
