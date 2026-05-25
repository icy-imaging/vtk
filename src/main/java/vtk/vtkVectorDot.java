// java wrapper for vtkVectorDot object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVectorDot extends vtkDataSetAlgorithm
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

  private native void SetMapScalars_4(int id0);
  public void SetMapScalars(int id0)
  {
    SetMapScalars_4(id0);
  }

  private native int GetMapScalars_5();
  public int GetMapScalars()
  {
    return GetMapScalars_5();
  }

  private native void MapScalarsOn_6();
  public void MapScalarsOn()
  {
    MapScalarsOn_6();
  }

  private native void MapScalarsOff_7();
  public void MapScalarsOff()
  {
    MapScalarsOff_7();
  }

  private native void SetScalarRange_8(double id0,double id1);
  public void SetScalarRange(double id0,double id1)
  {
    SetScalarRange_8(id0,id1);
  }

  private native void SetScalarRange_9(double id0[]);
  public void SetScalarRange(double id0[])
  {
    SetScalarRange_9(id0);
  }

  private native double[] GetScalarRange_10();
  public double[] GetScalarRange()
  {
    return GetScalarRange_10();
  }

  private native double[] GetActualRange_11();
  public double[] GetActualRange()
  {
    return GetActualRange_11();
  }

  public vtkVectorDot() { super(); }

  public vtkVectorDot(long id) { super(id); }
  public native long   VTKInit();

}
