// java wrapper for vtkGenericPointIterator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGenericPointIterator extends vtkObject
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

  private native void Begin_4();
  public void Begin()
  {
    Begin_4();
  }

  private native int IsAtEnd_5();
  public int IsAtEnd()
  {
    return IsAtEnd_5();
  }

  private native void Next_6();
  public void Next()
  {
    Next_6();
  }

  private native void GetPosition_7(double id0[]);
  public void GetPosition(double id0[])
  {
    GetPosition_7(id0);
  }

  private native long GetId_8();
  public long GetId()
  {
    return GetId_8();
  }

  public vtkGenericPointIterator() { super(); }

  public vtkGenericPointIterator(long id) { super(id); }

}
