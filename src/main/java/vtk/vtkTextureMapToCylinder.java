// java wrapper for vtkTextureMapToCylinder object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTextureMapToCylinder extends vtkDataSetAlgorithm
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

  private native void SetPoint1_4(double id0,double id1,double id2);
  public void SetPoint1(double id0,double id1,double id2)
  {
    SetPoint1_4(id0,id1,id2);
  }

  private native void SetPoint1_5(double id0[]);
  public void SetPoint1(double id0[])
  {
    SetPoint1_5(id0);
  }

  private native double[] GetPoint1_6();
  public double[] GetPoint1()
  {
    return GetPoint1_6();
  }

  private native void SetPoint2_7(double id0,double id1,double id2);
  public void SetPoint2(double id0,double id1,double id2)
  {
    SetPoint2_7(id0,id1,id2);
  }

  private native void SetPoint2_8(double id0[]);
  public void SetPoint2(double id0[])
  {
    SetPoint2_8(id0);
  }

  private native double[] GetPoint2_9();
  public double[] GetPoint2()
  {
    return GetPoint2_9();
  }

  private native void SetAutomaticCylinderGeneration_10(int id0);
  public void SetAutomaticCylinderGeneration(int id0)
  {
    SetAutomaticCylinderGeneration_10(id0);
  }

  private native int GetAutomaticCylinderGeneration_11();
  public int GetAutomaticCylinderGeneration()
  {
    return GetAutomaticCylinderGeneration_11();
  }

  private native void AutomaticCylinderGenerationOn_12();
  public void AutomaticCylinderGenerationOn()
  {
    AutomaticCylinderGenerationOn_12();
  }

  private native void AutomaticCylinderGenerationOff_13();
  public void AutomaticCylinderGenerationOff()
  {
    AutomaticCylinderGenerationOff_13();
  }

  private native void SetPreventSeam_14(int id0);
  public void SetPreventSeam(int id0)
  {
    SetPreventSeam_14(id0);
  }

  private native int GetPreventSeam_15();
  public int GetPreventSeam()
  {
    return GetPreventSeam_15();
  }

  private native void PreventSeamOn_16();
  public void PreventSeamOn()
  {
    PreventSeamOn_16();
  }

  private native void PreventSeamOff_17();
  public void PreventSeamOff()
  {
    PreventSeamOff_17();
  }

  public vtkTextureMapToCylinder() { super(); }

  public vtkTextureMapToCylinder(long id) { super(id); }
  public native long   VTKInit();

}
