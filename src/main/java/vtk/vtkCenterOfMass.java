// java wrapper for vtkCenterOfMass object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCenterOfMass extends vtkPointSetAlgorithm
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

  private native void SetCenter_4(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_4(id0,id1,id2);
  }

  private native void SetCenter_5(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_5(id0);
  }

  private native double[] GetCenter_6();
  public double[] GetCenter()
  {
    return GetCenter_6();
  }

  private native void SetUseScalarsAsWeights_7(boolean id0);
  public void SetUseScalarsAsWeights(boolean id0)
  {
    SetUseScalarsAsWeights_7(id0);
  }

  private native boolean GetUseScalarsAsWeights_8();
  public boolean GetUseScalarsAsWeights()
  {
    return GetUseScalarsAsWeights_8();
  }

  private native void ComputeCenterOfMass_9(vtkPoints id0,vtkDataArray id1,double id2[]);
  public void ComputeCenterOfMass(vtkPoints id0,vtkDataArray id1,double id2[])
  {
    ComputeCenterOfMass_9(id0,id1,id2);
  }

  public vtkCenterOfMass() { super(); }

  public vtkCenterOfMass(long id) { super(id); }
  public native long   VTKInit();

}
