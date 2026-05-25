// java wrapper for vtkHandleSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHandleSource extends vtkPolyDataAlgorithm
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

  private native void SetDirectional_4(boolean id0);
  public void SetDirectional(boolean id0)
  {
    SetDirectional_4(id0);
  }

  private native boolean GetDirectional_5();
  public boolean GetDirectional()
  {
    return GetDirectional_5();
  }

  private native void DirectionalOn_6();
  public void DirectionalOn()
  {
    DirectionalOn_6();
  }

  private native void DirectionalOff_7();
  public void DirectionalOff()
  {
    DirectionalOff_7();
  }

  private native void SetPosition_8(double id0[]);
  public void SetPosition(double id0[])
  {
    SetPosition_8(id0);
  }

  private native void SetPosition_9(double id0,double id1,double id2);
  public void SetPosition(double id0,double id1,double id2)
  {
    SetPosition_9(id0,id1,id2);
  }

  private native void GetPosition_10(double id0[]);
  public void GetPosition(double id0[])
  {
    GetPosition_10(id0);
  }

  private native void SetDirection_11(double id0[]);
  public void SetDirection(double id0[])
  {
    SetDirection_11(id0);
  }

  private native void SetDirection_12(double id0,double id1,double id2);
  public void SetDirection(double id0,double id1,double id2)
  {
    SetDirection_12(id0,id1,id2);
  }

  private native void GetDirection_13(double id0[]);
  public void GetDirection(double id0[])
  {
    GetDirection_13(id0);
  }

  private native void SetSize_14(double id0);
  public void SetSize(double id0)
  {
    SetSize_14(id0);
  }

  private native double GetSize_15();
  public double GetSize()
  {
    return GetSize_15();
  }

  public vtkHandleSource() { super(); }

  public vtkHandleSource(long id) { super(id); }

}
