// java wrapper for vtkPolyDataNormals object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolyDataNormals extends vtkPolyDataAlgorithm
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

  private native void SetFeatureAngle_4(double id0);
  public void SetFeatureAngle(double id0)
  {
    SetFeatureAngle_4(id0);
  }

  private native double GetFeatureAngleMinValue_5();
  public double GetFeatureAngleMinValue()
  {
    return GetFeatureAngleMinValue_5();
  }

  private native double GetFeatureAngleMaxValue_6();
  public double GetFeatureAngleMaxValue()
  {
    return GetFeatureAngleMaxValue_6();
  }

  private native double GetFeatureAngle_7();
  public double GetFeatureAngle()
  {
    return GetFeatureAngle_7();
  }

  private native void SetSplitting_8(int id0);
  public void SetSplitting(int id0)
  {
    SetSplitting_8(id0);
  }

  private native int GetSplitting_9();
  public int GetSplitting()
  {
    return GetSplitting_9();
  }

  private native void SplittingOn_10();
  public void SplittingOn()
  {
    SplittingOn_10();
  }

  private native void SplittingOff_11();
  public void SplittingOff()
  {
    SplittingOff_11();
  }

  private native void SetConsistency_12(int id0);
  public void SetConsistency(int id0)
  {
    SetConsistency_12(id0);
  }

  private native int GetConsistency_13();
  public int GetConsistency()
  {
    return GetConsistency_13();
  }

  private native void ConsistencyOn_14();
  public void ConsistencyOn()
  {
    ConsistencyOn_14();
  }

  private native void ConsistencyOff_15();
  public void ConsistencyOff()
  {
    ConsistencyOff_15();
  }

  private native void SetAutoOrientNormals_16(int id0);
  public void SetAutoOrientNormals(int id0)
  {
    SetAutoOrientNormals_16(id0);
  }

  private native int GetAutoOrientNormals_17();
  public int GetAutoOrientNormals()
  {
    return GetAutoOrientNormals_17();
  }

  private native void AutoOrientNormalsOn_18();
  public void AutoOrientNormalsOn()
  {
    AutoOrientNormalsOn_18();
  }

  private native void AutoOrientNormalsOff_19();
  public void AutoOrientNormalsOff()
  {
    AutoOrientNormalsOff_19();
  }

  private native void SetComputePointNormals_20(int id0);
  public void SetComputePointNormals(int id0)
  {
    SetComputePointNormals_20(id0);
  }

  private native int GetComputePointNormals_21();
  public int GetComputePointNormals()
  {
    return GetComputePointNormals_21();
  }

  private native void ComputePointNormalsOn_22();
  public void ComputePointNormalsOn()
  {
    ComputePointNormalsOn_22();
  }

  private native void ComputePointNormalsOff_23();
  public void ComputePointNormalsOff()
  {
    ComputePointNormalsOff_23();
  }

  private native void SetComputeCellNormals_24(int id0);
  public void SetComputeCellNormals(int id0)
  {
    SetComputeCellNormals_24(id0);
  }

  private native int GetComputeCellNormals_25();
  public int GetComputeCellNormals()
  {
    return GetComputeCellNormals_25();
  }

  private native void ComputeCellNormalsOn_26();
  public void ComputeCellNormalsOn()
  {
    ComputeCellNormalsOn_26();
  }

  private native void ComputeCellNormalsOff_27();
  public void ComputeCellNormalsOff()
  {
    ComputeCellNormalsOff_27();
  }

  private native void SetFlipNormals_28(int id0);
  public void SetFlipNormals(int id0)
  {
    SetFlipNormals_28(id0);
  }

  private native int GetFlipNormals_29();
  public int GetFlipNormals()
  {
    return GetFlipNormals_29();
  }

  private native void FlipNormalsOn_30();
  public void FlipNormalsOn()
  {
    FlipNormalsOn_30();
  }

  private native void FlipNormalsOff_31();
  public void FlipNormalsOff()
  {
    FlipNormalsOff_31();
  }

  private native void SetNonManifoldTraversal_32(int id0);
  public void SetNonManifoldTraversal(int id0)
  {
    SetNonManifoldTraversal_32(id0);
  }

  private native int GetNonManifoldTraversal_33();
  public int GetNonManifoldTraversal()
  {
    return GetNonManifoldTraversal_33();
  }

  private native void NonManifoldTraversalOn_34();
  public void NonManifoldTraversalOn()
  {
    NonManifoldTraversalOn_34();
  }

  private native void NonManifoldTraversalOff_35();
  public void NonManifoldTraversalOff()
  {
    NonManifoldTraversalOff_35();
  }

  private native void SetOutputPointsPrecision_36(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_36(id0);
  }

  private native int GetOutputPointsPrecisionMinValue_37();
  public int GetOutputPointsPrecisionMinValue()
  {
    return GetOutputPointsPrecisionMinValue_37();
  }

  private native int GetOutputPointsPrecisionMaxValue_38();
  public int GetOutputPointsPrecisionMaxValue()
  {
    return GetOutputPointsPrecisionMaxValue_38();
  }

  private native int GetOutputPointsPrecision_39();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_39();
  }

  public vtkPolyDataNormals() { super(); }

  public vtkPolyDataNormals(long id) { super(id); }
  public native long   VTKInit();

}
