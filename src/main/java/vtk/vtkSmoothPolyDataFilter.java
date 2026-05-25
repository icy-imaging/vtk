// java wrapper for vtkSmoothPolyDataFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkSmoothPolyDataFilter extends vtkPolyDataAlgorithm
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

  private native void SetConvergence_4(double id0);
  public void SetConvergence(double id0)
  {
    SetConvergence_4(id0);
  }

  private native double GetConvergenceMinValue_5();
  public double GetConvergenceMinValue()
  {
    return GetConvergenceMinValue_5();
  }

  private native double GetConvergenceMaxValue_6();
  public double GetConvergenceMaxValue()
  {
    return GetConvergenceMaxValue_6();
  }

  private native double GetConvergence_7();
  public double GetConvergence()
  {
    return GetConvergence_7();
  }

  private native void SetNumberOfIterations_8(int id0);
  public void SetNumberOfIterations(int id0)
  {
    SetNumberOfIterations_8(id0);
  }

  private native int GetNumberOfIterationsMinValue_9();
  public int GetNumberOfIterationsMinValue()
  {
    return GetNumberOfIterationsMinValue_9();
  }

  private native int GetNumberOfIterationsMaxValue_10();
  public int GetNumberOfIterationsMaxValue()
  {
    return GetNumberOfIterationsMaxValue_10();
  }

  private native int GetNumberOfIterations_11();
  public int GetNumberOfIterations()
  {
    return GetNumberOfIterations_11();
  }

  private native void SetRelaxationFactor_12(double id0);
  public void SetRelaxationFactor(double id0)
  {
    SetRelaxationFactor_12(id0);
  }

  private native double GetRelaxationFactor_13();
  public double GetRelaxationFactor()
  {
    return GetRelaxationFactor_13();
  }

  private native void SetFeatureEdgeSmoothing_14(int id0);
  public void SetFeatureEdgeSmoothing(int id0)
  {
    SetFeatureEdgeSmoothing_14(id0);
  }

  private native int GetFeatureEdgeSmoothing_15();
  public int GetFeatureEdgeSmoothing()
  {
    return GetFeatureEdgeSmoothing_15();
  }

  private native void FeatureEdgeSmoothingOn_16();
  public void FeatureEdgeSmoothingOn()
  {
    FeatureEdgeSmoothingOn_16();
  }

  private native void FeatureEdgeSmoothingOff_17();
  public void FeatureEdgeSmoothingOff()
  {
    FeatureEdgeSmoothingOff_17();
  }

  private native void SetFeatureAngle_18(double id0);
  public void SetFeatureAngle(double id0)
  {
    SetFeatureAngle_18(id0);
  }

  private native double GetFeatureAngleMinValue_19();
  public double GetFeatureAngleMinValue()
  {
    return GetFeatureAngleMinValue_19();
  }

  private native double GetFeatureAngleMaxValue_20();
  public double GetFeatureAngleMaxValue()
  {
    return GetFeatureAngleMaxValue_20();
  }

  private native double GetFeatureAngle_21();
  public double GetFeatureAngle()
  {
    return GetFeatureAngle_21();
  }

  private native void SetEdgeAngle_22(double id0);
  public void SetEdgeAngle(double id0)
  {
    SetEdgeAngle_22(id0);
  }

  private native double GetEdgeAngleMinValue_23();
  public double GetEdgeAngleMinValue()
  {
    return GetEdgeAngleMinValue_23();
  }

  private native double GetEdgeAngleMaxValue_24();
  public double GetEdgeAngleMaxValue()
  {
    return GetEdgeAngleMaxValue_24();
  }

  private native double GetEdgeAngle_25();
  public double GetEdgeAngle()
  {
    return GetEdgeAngle_25();
  }

  private native void SetBoundarySmoothing_26(int id0);
  public void SetBoundarySmoothing(int id0)
  {
    SetBoundarySmoothing_26(id0);
  }

  private native int GetBoundarySmoothing_27();
  public int GetBoundarySmoothing()
  {
    return GetBoundarySmoothing_27();
  }

  private native void BoundarySmoothingOn_28();
  public void BoundarySmoothingOn()
  {
    BoundarySmoothingOn_28();
  }

  private native void BoundarySmoothingOff_29();
  public void BoundarySmoothingOff()
  {
    BoundarySmoothingOff_29();
  }

  private native void SetGenerateErrorScalars_30(int id0);
  public void SetGenerateErrorScalars(int id0)
  {
    SetGenerateErrorScalars_30(id0);
  }

  private native int GetGenerateErrorScalars_31();
  public int GetGenerateErrorScalars()
  {
    return GetGenerateErrorScalars_31();
  }

  private native void GenerateErrorScalarsOn_32();
  public void GenerateErrorScalarsOn()
  {
    GenerateErrorScalarsOn_32();
  }

  private native void GenerateErrorScalarsOff_33();
  public void GenerateErrorScalarsOff()
  {
    GenerateErrorScalarsOff_33();
  }

  private native void SetGenerateErrorVectors_34(int id0);
  public void SetGenerateErrorVectors(int id0)
  {
    SetGenerateErrorVectors_34(id0);
  }

  private native int GetGenerateErrorVectors_35();
  public int GetGenerateErrorVectors()
  {
    return GetGenerateErrorVectors_35();
  }

  private native void GenerateErrorVectorsOn_36();
  public void GenerateErrorVectorsOn()
  {
    GenerateErrorVectorsOn_36();
  }

  private native void GenerateErrorVectorsOff_37();
  public void GenerateErrorVectorsOff()
  {
    GenerateErrorVectorsOff_37();
  }

  private native void SetSourceData_38(vtkPolyData id0);
  public void SetSourceData(vtkPolyData id0)
  {
    SetSourceData_38(id0);
  }

  private native long GetSource_39();
  public vtkPolyData GetSource()
  {
    long temp = GetSource_39();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutputPointsPrecision_40(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_40(id0);
  }

  private native int GetOutputPointsPrecision_41();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_41();
  }

  public vtkSmoothPolyDataFilter() { super(); }

  public vtkSmoothPolyDataFilter(long id) { super(id); }
  public native long   VTKInit();

}
