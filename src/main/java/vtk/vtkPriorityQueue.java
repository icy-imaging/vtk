// java wrapper for vtkPriorityQueue object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPriorityQueue extends vtkObject
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

  private native void Allocate_4(long id0,long id1);
  public void Allocate(long id0,long id1)
  {
    Allocate_4(id0,id1);
  }

  private native void Insert_5(double id0,long id1);
  public void Insert(double id0,long id1)
  {
    Insert_5(id0,id1);
  }

  private native long Pop_6(long id0);
  public long Pop(long id0)
  {
    return Pop_6(id0);
  }

  private native long Peek_7(long id0);
  public long Peek(long id0)
  {
    return Peek_7(id0);
  }

  private native double DeleteId_8(long id0);
  public double DeleteId(long id0)
  {
    return DeleteId_8(id0);
  }

  private native double GetPriority_9(long id0);
  public double GetPriority(long id0)
  {
    return GetPriority_9(id0);
  }

  private native long GetNumberOfItems_10();
  public long GetNumberOfItems()
  {
    return GetNumberOfItems_10();
  }

  private native void Reset_11();
  public void Reset()
  {
    Reset_11();
  }

  public vtkPriorityQueue() { super(); }

  public vtkPriorityQueue(long id) { super(id); }
  public native long   VTKInit();

}
