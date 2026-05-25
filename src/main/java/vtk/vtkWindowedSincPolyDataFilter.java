// java wrapper for vtkWindowedSincPolyDataFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkWindowedSincPolyDataFilter extends vtkPolyDataAlgorithm
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

  private native void SetNumberOfIterations_4(int id0);
  public void SetNumberOfIterations(int id0)
  {
    SetNumberOfIterations_4(id0);
  }

  private native int GetNumberOfIterationsMinValue_5();
  public int GetNumberOfIterationsMinValue()
  {
    return GetNumberOfIterationsMinValue_5();
  }

  private native int GetNumberOfIterationsMaxValue_6();
  public int GetNumberOfIterationsMaxValue()
  {
    return GetNumberOfIterationsMaxValue_6();
  }

  private native int GetNumberOfIterations_7();
  public int GetNumberOfIterations()
  {
    return GetNumberOfIterations_7();
  }

  private native void SetPassBand_8(double id0);
  public void SetPassBand(double id0)
  {
    SetPassBand_8(id0);
  }

  private native double GetPassBandMinValue_9();
  public double GetPassBandMinValue()
  {
    return GetPassBandMinValue_9();
  }

  private native double GetPassBandMaxValue_10();
  public double GetPassBandMaxValue()
  {
    return GetPassBandMaxValue_10();
  }

  private native double GetPassBand_11();
  public double GetPassBand()
  {
    return GetPassBand_11();
  }

  private native void SetNormalizeCoordinates_12(int id0);
  public void SetNormalizeCoordinates(int id0)
  {
    SetNormalizeCoordinates_12(id0);
  }

  private native int GetNormalizeCoordinates_13();
  public int GetNormalizeCoordinates()
  {
    return GetNormalizeCoordinates_13();
  }

  private native void NormalizeCoordinatesOn_14();
  public void NormalizeCoordinatesOn()
  {
    NormalizeCoordinatesOn_14();
  }

  private native void NormalizeCoordinatesOff_15();
  public void NormalizeCoordinatesOff()
  {
    NormalizeCoordinatesOff_15();
  }

  private native void SetWindowFunction_16(int id0);
  public void SetWindowFunction(int id0)
  {
    SetWindowFunction_16(id0);
  }

  private native int GetWindowFunctionMinValue_17();
  public int GetWindowFunctionMinValue()
  {
    return GetWindowFunctionMinValue_17();
  }

  private native int GetWindowFunctionMaxValue_18();
  public int GetWindowFunctionMaxValue()
  {
    return GetWindowFunctionMaxValue_18();
  }

  private native int GetWindowFunction_19();
  public int GetWindowFunction()
  {
    return GetWindowFunction_19();
  }

  private native void SetWindowFunctionToNuttall_20();
  public void SetWindowFunctionToNuttall()
  {
    SetWindowFunctionToNuttall_20();
  }

  private native void SetWindowFunctionToBlackman_21();
  public void SetWindowFunctionToBlackman()
  {
    SetWindowFunctionToBlackman_21();
  }

  private native void SetWindowFunctionoHanning_22();
  public void SetWindowFunctionoHanning()
  {
    SetWindowFunctionoHanning_22();
  }

  private native void SetWindowFunctionToHamming_23();
  public void SetWindowFunctionToHamming()
  {
    SetWindowFunctionToHamming_23();
  }

  private native void SetFeatureEdgeSmoothing_24(int id0);
  public void SetFeatureEdgeSmoothing(int id0)
  {
    SetFeatureEdgeSmoothing_24(id0);
  }

  private native int GetFeatureEdgeSmoothing_25();
  public int GetFeatureEdgeSmoothing()
  {
    return GetFeatureEdgeSmoothing_25();
  }

  private native void FeatureEdgeSmoothingOn_26();
  public void FeatureEdgeSmoothingOn()
  {
    FeatureEdgeSmoothingOn_26();
  }

  private native void FeatureEdgeSmoothingOff_27();
  public void FeatureEdgeSmoothingOff()
  {
    FeatureEdgeSmoothingOff_27();
  }

  private native void SetFeatureAngle_28(double id0);
  public void SetFeatureAngle(double id0)
  {
    SetFeatureAngle_28(id0);
  }

  private native double GetFeatureAngleMinValue_29();
  public double GetFeatureAngleMinValue()
  {
    return GetFeatureAngleMinValue_29();
  }

  private native double GetFeatureAngleMaxValue_30();
  public double GetFeatureAngleMaxValue()
  {
    return GetFeatureAngleMaxValue_30();
  }

  private native double GetFeatureAngle_31();
  public double GetFeatureAngle()
  {
    return GetFeatureAngle_31();
  }

  private native void SetEdgeAngle_32(double id0);
  public void SetEdgeAngle(double id0)
  {
    SetEdgeAngle_32(id0);
  }

  private native double GetEdgeAngleMinValue_33();
  public double GetEdgeAngleMinValue()
  {
    return GetEdgeAngleMinValue_33();
  }

  private native double GetEdgeAngleMaxValue_34();
  public double GetEdgeAngleMaxValue()
  {
    return GetEdgeAngleMaxValue_34();
  }

  private native double GetEdgeAngle_35();
  public double GetEdgeAngle()
  {
    return GetEdgeAngle_35();
  }

  private native void SetBoundarySmoothing_36(int id0);
  public void SetBoundarySmoothing(int id0)
  {
    SetBoundarySmoothing_36(id0);
  }

  private native int GetBoundarySmoothing_37();
  public int GetBoundarySmoothing()
  {
    return GetBoundarySmoothing_37();
  }

  private native void BoundarySmoothingOn_38();
  public void BoundarySmoothingOn()
  {
    BoundarySmoothingOn_38();
  }

  private native void BoundarySmoothingOff_39();
  public void BoundarySmoothingOff()
  {
    BoundarySmoothingOff_39();
  }

  private native void SetNonManifoldSmoothing_40(int id0);
  public void SetNonManifoldSmoothing(int id0)
  {
    SetNonManifoldSmoothing_40(id0);
  }

  private native int GetNonManifoldSmoothing_41();
  public int GetNonManifoldSmoothing()
  {
    return GetNonManifoldSmoothing_41();
  }

  private native void NonManifoldSmoothingOn_42();
  public void NonManifoldSmoothingOn()
  {
    NonManifoldSmoothingOn_42();
  }

  private native void NonManifoldSmoothingOff_43();
  public void NonManifoldSmoothingOff()
  {
    NonManifoldSmoothingOff_43();
  }

  private native void SetWeightNonManifoldEdges_44(int id0);
  public void SetWeightNonManifoldEdges(int id0)
  {
    SetWeightNonManifoldEdges_44(id0);
  }

  private native int GetWeightNonManifoldEdges_45();
  public int GetWeightNonManifoldEdges()
  {
    return GetWeightNonManifoldEdges_45();
  }

  private native void WeightNonManifoldEdgesOn_46();
  public void WeightNonManifoldEdgesOn()
  {
    WeightNonManifoldEdgesOn_46();
  }

  private native void WeightNonManifoldEdgesOff_47();
  public void WeightNonManifoldEdgesOff()
  {
    WeightNonManifoldEdgesOff_47();
  }

  private native void SetGenerateErrorScalars_48(int id0);
  public void SetGenerateErrorScalars(int id0)
  {
    SetGenerateErrorScalars_48(id0);
  }

  private native int GetGenerateErrorScalars_49();
  public int GetGenerateErrorScalars()
  {
    return GetGenerateErrorScalars_49();
  }

  private native void GenerateErrorScalarsOn_50();
  public void GenerateErrorScalarsOn()
  {
    GenerateErrorScalarsOn_50();
  }

  private native void GenerateErrorScalarsOff_51();
  public void GenerateErrorScalarsOff()
  {
    GenerateErrorScalarsOff_51();
  }

  private native void SetGenerateErrorVectors_52(int id0);
  public void SetGenerateErrorVectors(int id0)
  {
    SetGenerateErrorVectors_52(id0);
  }

  private native int GetGenerateErrorVectors_53();
  public int GetGenerateErrorVectors()
  {
    return GetGenerateErrorVectors_53();
  }

  private native void GenerateErrorVectorsOn_54();
  public void GenerateErrorVectorsOn()
  {
    GenerateErrorVectorsOn_54();
  }

  private native void GenerateErrorVectorsOff_55();
  public void GenerateErrorVectorsOff()
  {
    GenerateErrorVectorsOff_55();
  }

  public vtkWindowedSincPolyDataFilter() { super(); }

  public vtkWindowedSincPolyDataFilter(long id) { super(id); }
  public native long   VTKInit();

}
