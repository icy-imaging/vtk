// java wrapper for vtkTextureMapToPlane object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTextureMapToPlane extends vtkDataSetAlgorithm
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

  private native void SetOrigin_4(double id0,double id1,double id2);
  public void SetOrigin(double id0,double id1,double id2)
  {
    SetOrigin_4(id0,id1,id2);
  }

  private native void SetOrigin_5(double id0[]);
  public void SetOrigin(double id0[])
  {
    SetOrigin_5(id0);
  }

  private native double[] GetOrigin_6();
  public double[] GetOrigin()
  {
    return GetOrigin_6();
  }

  private native void SetPoint1_7(double id0,double id1,double id2);
  public void SetPoint1(double id0,double id1,double id2)
  {
    SetPoint1_7(id0,id1,id2);
  }

  private native void SetPoint1_8(double id0[]);
  public void SetPoint1(double id0[])
  {
    SetPoint1_8(id0);
  }

  private native double[] GetPoint1_9();
  public double[] GetPoint1()
  {
    return GetPoint1_9();
  }

  private native void SetPoint2_10(double id0,double id1,double id2);
  public void SetPoint2(double id0,double id1,double id2)
  {
    SetPoint2_10(id0,id1,id2);
  }

  private native void SetPoint2_11(double id0[]);
  public void SetPoint2(double id0[])
  {
    SetPoint2_11(id0);
  }

  private native double[] GetPoint2_12();
  public double[] GetPoint2()
  {
    return GetPoint2_12();
  }

  private native void SetNormal_13(double id0,double id1,double id2);
  public void SetNormal(double id0,double id1,double id2)
  {
    SetNormal_13(id0,id1,id2);
  }

  private native void SetNormal_14(double id0[]);
  public void SetNormal(double id0[])
  {
    SetNormal_14(id0);
  }

  private native double[] GetNormal_15();
  public double[] GetNormal()
  {
    return GetNormal_15();
  }

  private native void SetSRange_16(double id0,double id1);
  public void SetSRange(double id0,double id1)
  {
    SetSRange_16(id0,id1);
  }

  private native void SetSRange_17(double id0[]);
  public void SetSRange(double id0[])
  {
    SetSRange_17(id0);
  }

  private native double[] GetSRange_18();
  public double[] GetSRange()
  {
    return GetSRange_18();
  }

  private native void SetTRange_19(double id0,double id1);
  public void SetTRange(double id0,double id1)
  {
    SetTRange_19(id0,id1);
  }

  private native void SetTRange_20(double id0[]);
  public void SetTRange(double id0[])
  {
    SetTRange_20(id0);
  }

  private native double[] GetTRange_21();
  public double[] GetTRange()
  {
    return GetTRange_21();
  }

  private native void SetAutomaticPlaneGeneration_22(int id0);
  public void SetAutomaticPlaneGeneration(int id0)
  {
    SetAutomaticPlaneGeneration_22(id0);
  }

  private native int GetAutomaticPlaneGeneration_23();
  public int GetAutomaticPlaneGeneration()
  {
    return GetAutomaticPlaneGeneration_23();
  }

  private native void AutomaticPlaneGenerationOn_24();
  public void AutomaticPlaneGenerationOn()
  {
    AutomaticPlaneGenerationOn_24();
  }

  private native void AutomaticPlaneGenerationOff_25();
  public void AutomaticPlaneGenerationOff()
  {
    AutomaticPlaneGenerationOff_25();
  }

  public vtkTextureMapToPlane() { super(); }

  public vtkTextureMapToPlane(long id) { super(id); }
  public native long   VTKInit();

}
