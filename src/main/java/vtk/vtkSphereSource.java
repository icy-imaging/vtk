// java wrapper for vtkSphereSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSphereSource extends vtkPolyDataAlgorithm
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

  private native void SetRadius_4(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_4(id0);
  }

  private native double GetRadiusMinValue_5();
  public double GetRadiusMinValue()
  {
    return GetRadiusMinValue_5();
  }

  private native double GetRadiusMaxValue_6();
  public double GetRadiusMaxValue()
  {
    return GetRadiusMaxValue_6();
  }

  private native double GetRadius_7();
  public double GetRadius()
  {
    return GetRadius_7();
  }

  private native void SetCenter_8(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_8(id0,id1,id2);
  }

  private native void SetCenter_9(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_9(id0);
  }

  private native double[] GetCenter_10();
  public double[] GetCenter()
  {
    return GetCenter_10();
  }

  private native void SetThetaResolution_11(int id0);
  public void SetThetaResolution(int id0)
  {
    SetThetaResolution_11(id0);
  }

  private native int GetThetaResolutionMinValue_12();
  public int GetThetaResolutionMinValue()
  {
    return GetThetaResolutionMinValue_12();
  }

  private native int GetThetaResolutionMaxValue_13();
  public int GetThetaResolutionMaxValue()
  {
    return GetThetaResolutionMaxValue_13();
  }

  private native int GetThetaResolution_14();
  public int GetThetaResolution()
  {
    return GetThetaResolution_14();
  }

  private native void SetPhiResolution_15(int id0);
  public void SetPhiResolution(int id0)
  {
    SetPhiResolution_15(id0);
  }

  private native int GetPhiResolutionMinValue_16();
  public int GetPhiResolutionMinValue()
  {
    return GetPhiResolutionMinValue_16();
  }

  private native int GetPhiResolutionMaxValue_17();
  public int GetPhiResolutionMaxValue()
  {
    return GetPhiResolutionMaxValue_17();
  }

  private native int GetPhiResolution_18();
  public int GetPhiResolution()
  {
    return GetPhiResolution_18();
  }

  private native void SetStartTheta_19(double id0);
  public void SetStartTheta(double id0)
  {
    SetStartTheta_19(id0);
  }

  private native double GetStartThetaMinValue_20();
  public double GetStartThetaMinValue()
  {
    return GetStartThetaMinValue_20();
  }

  private native double GetStartThetaMaxValue_21();
  public double GetStartThetaMaxValue()
  {
    return GetStartThetaMaxValue_21();
  }

  private native double GetStartTheta_22();
  public double GetStartTheta()
  {
    return GetStartTheta_22();
  }

  private native void SetEndTheta_23(double id0);
  public void SetEndTheta(double id0)
  {
    SetEndTheta_23(id0);
  }

  private native double GetEndThetaMinValue_24();
  public double GetEndThetaMinValue()
  {
    return GetEndThetaMinValue_24();
  }

  private native double GetEndThetaMaxValue_25();
  public double GetEndThetaMaxValue()
  {
    return GetEndThetaMaxValue_25();
  }

  private native double GetEndTheta_26();
  public double GetEndTheta()
  {
    return GetEndTheta_26();
  }

  private native void SetStartPhi_27(double id0);
  public void SetStartPhi(double id0)
  {
    SetStartPhi_27(id0);
  }

  private native double GetStartPhiMinValue_28();
  public double GetStartPhiMinValue()
  {
    return GetStartPhiMinValue_28();
  }

  private native double GetStartPhiMaxValue_29();
  public double GetStartPhiMaxValue()
  {
    return GetStartPhiMaxValue_29();
  }

  private native double GetStartPhi_30();
  public double GetStartPhi()
  {
    return GetStartPhi_30();
  }

  private native void SetEndPhi_31(double id0);
  public void SetEndPhi(double id0)
  {
    SetEndPhi_31(id0);
  }

  private native double GetEndPhiMinValue_32();
  public double GetEndPhiMinValue()
  {
    return GetEndPhiMinValue_32();
  }

  private native double GetEndPhiMaxValue_33();
  public double GetEndPhiMaxValue()
  {
    return GetEndPhiMaxValue_33();
  }

  private native double GetEndPhi_34();
  public double GetEndPhi()
  {
    return GetEndPhi_34();
  }

  private native void SetLatLongTessellation_35(int id0);
  public void SetLatLongTessellation(int id0)
  {
    SetLatLongTessellation_35(id0);
  }

  private native int GetLatLongTessellation_36();
  public int GetLatLongTessellation()
  {
    return GetLatLongTessellation_36();
  }

  private native void LatLongTessellationOn_37();
  public void LatLongTessellationOn()
  {
    LatLongTessellationOn_37();
  }

  private native void LatLongTessellationOff_38();
  public void LatLongTessellationOff()
  {
    LatLongTessellationOff_38();
  }

  private native void SetOutputPointsPrecision_39(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_39(id0);
  }

  private native int GetOutputPointsPrecision_40();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_40();
  }

  private native void SetGenerateNormals_41(int id0);
  public void SetGenerateNormals(int id0)
  {
    SetGenerateNormals_41(id0);
  }

  private native int GetGenerateNormals_42();
  public int GetGenerateNormals()
  {
    return GetGenerateNormals_42();
  }

  private native void GenerateNormalsOn_43();
  public void GenerateNormalsOn()
  {
    GenerateNormalsOn_43();
  }

  private native void GenerateNormalsOff_44();
  public void GenerateNormalsOff()
  {
    GenerateNormalsOff_44();
  }

  public vtkSphereSource() { super(); }

  public vtkSphereSource(long id) { super(id); }
  public native long   VTKInit();

}
