// java wrapper for vtkTextureMapToSphere object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTextureMapToSphere extends vtkDataSetAlgorithm
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

  private native void SetAutomaticSphereGeneration_7(int id0);
  public void SetAutomaticSphereGeneration(int id0)
  {
    SetAutomaticSphereGeneration_7(id0);
  }

  private native int GetAutomaticSphereGeneration_8();
  public int GetAutomaticSphereGeneration()
  {
    return GetAutomaticSphereGeneration_8();
  }

  private native void AutomaticSphereGenerationOn_9();
  public void AutomaticSphereGenerationOn()
  {
    AutomaticSphereGenerationOn_9();
  }

  private native void AutomaticSphereGenerationOff_10();
  public void AutomaticSphereGenerationOff()
  {
    AutomaticSphereGenerationOff_10();
  }

  private native void SetPreventSeam_11(int id0);
  public void SetPreventSeam(int id0)
  {
    SetPreventSeam_11(id0);
  }

  private native int GetPreventSeam_12();
  public int GetPreventSeam()
  {
    return GetPreventSeam_12();
  }

  private native void PreventSeamOn_13();
  public void PreventSeamOn()
  {
    PreventSeamOn_13();
  }

  private native void PreventSeamOff_14();
  public void PreventSeamOff()
  {
    PreventSeamOff_14();
  }

  private native void ComputeCenter_15(vtkDataSet id0);
  public void ComputeCenter(vtkDataSet id0)
  {
    ComputeCenter_15(id0);
  }

  public vtkTextureMapToSphere() { super(); }

  public vtkTextureMapToSphere(long id) { super(id); }
  public native long   VTKInit();

}
