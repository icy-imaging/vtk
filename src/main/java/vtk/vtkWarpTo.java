// java wrapper for vtkWarpTo object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkWarpTo extends vtkPointSetAlgorithm
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

  private native void SetScaleFactor_4(double id0);
  public void SetScaleFactor(double id0)
  {
    SetScaleFactor_4(id0);
  }

  private native double GetScaleFactor_5();
  public double GetScaleFactor()
  {
    return GetScaleFactor_5();
  }

  private native double[] GetPosition_6();
  public double[] GetPosition()
  {
    return GetPosition_6();
  }

  private native void SetPosition_7(double id0,double id1,double id2);
  public void SetPosition(double id0,double id1,double id2)
  {
    SetPosition_7(id0,id1,id2);
  }

  private native void SetPosition_8(double id0[]);
  public void SetPosition(double id0[])
  {
    SetPosition_8(id0);
  }

  private native void SetAbsolute_9(int id0);
  public void SetAbsolute(int id0)
  {
    SetAbsolute_9(id0);
  }

  private native int GetAbsolute_10();
  public int GetAbsolute()
  {
    return GetAbsolute_10();
  }

  private native void AbsoluteOn_11();
  public void AbsoluteOn()
  {
    AbsoluteOn_11();
  }

  private native void AbsoluteOff_12();
  public void AbsoluteOff()
  {
    AbsoluteOff_12();
  }

  private native int FillInputPortInformation_13(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_13(id0,id1);
  }

  public vtkWarpTo() { super(); }

  public vtkWarpTo(long id) { super(id); }
  public native long   VTKInit();

}
