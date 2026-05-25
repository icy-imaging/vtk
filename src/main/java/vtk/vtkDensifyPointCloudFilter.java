// java wrapper for vtkDensifyPointCloudFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDensifyPointCloudFilter extends vtkPolyDataAlgorithm
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

  private native void SetNeighborhoodType_4(int id0);
  public void SetNeighborhoodType(int id0)
  {
    SetNeighborhoodType_4(id0);
  }

  private native int GetNeighborhoodType_5();
  public int GetNeighborhoodType()
  {
    return GetNeighborhoodType_5();
  }

  private native void SetNeighborhoodTypeToRadius_6();
  public void SetNeighborhoodTypeToRadius()
  {
    SetNeighborhoodTypeToRadius_6();
  }

  private native void SetNeighborhoodTypeToNClosest_7();
  public void SetNeighborhoodTypeToNClosest()
  {
    SetNeighborhoodTypeToNClosest_7();
  }

  private native void SetRadius_8(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_8(id0);
  }

  private native double GetRadiusMinValue_9();
  public double GetRadiusMinValue()
  {
    return GetRadiusMinValue_9();
  }

  private native double GetRadiusMaxValue_10();
  public double GetRadiusMaxValue()
  {
    return GetRadiusMaxValue_10();
  }

  private native double GetRadius_11();
  public double GetRadius()
  {
    return GetRadius_11();
  }

  private native void SetNumberOfClosestPoints_12(int id0);
  public void SetNumberOfClosestPoints(int id0)
  {
    SetNumberOfClosestPoints_12(id0);
  }

  private native int GetNumberOfClosestPointsMinValue_13();
  public int GetNumberOfClosestPointsMinValue()
  {
    return GetNumberOfClosestPointsMinValue_13();
  }

  private native int GetNumberOfClosestPointsMaxValue_14();
  public int GetNumberOfClosestPointsMaxValue()
  {
    return GetNumberOfClosestPointsMaxValue_14();
  }

  private native int GetNumberOfClosestPoints_15();
  public int GetNumberOfClosestPoints()
  {
    return GetNumberOfClosestPoints_15();
  }

  private native void SetTargetDistance_16(double id0);
  public void SetTargetDistance(double id0)
  {
    SetTargetDistance_16(id0);
  }

  private native double GetTargetDistanceMinValue_17();
  public double GetTargetDistanceMinValue()
  {
    return GetTargetDistanceMinValue_17();
  }

  private native double GetTargetDistanceMaxValue_18();
  public double GetTargetDistanceMaxValue()
  {
    return GetTargetDistanceMaxValue_18();
  }

  private native double GetTargetDistance_19();
  public double GetTargetDistance()
  {
    return GetTargetDistance_19();
  }

  private native void SetMaximumNumberOfIterations_20(int id0);
  public void SetMaximumNumberOfIterations(int id0)
  {
    SetMaximumNumberOfIterations_20(id0);
  }

  private native int GetMaximumNumberOfIterationsMinValue_21();
  public int GetMaximumNumberOfIterationsMinValue()
  {
    return GetMaximumNumberOfIterationsMinValue_21();
  }

  private native int GetMaximumNumberOfIterationsMaxValue_22();
  public int GetMaximumNumberOfIterationsMaxValue()
  {
    return GetMaximumNumberOfIterationsMaxValue_22();
  }

  private native int GetMaximumNumberOfIterations_23();
  public int GetMaximumNumberOfIterations()
  {
    return GetMaximumNumberOfIterations_23();
  }

  private native void SetMaximumNumberOfPoints_24(long id0);
  public void SetMaximumNumberOfPoints(long id0)
  {
    SetMaximumNumberOfPoints_24(id0);
  }

  private native long GetMaximumNumberOfPointsMinValue_25();
  public long GetMaximumNumberOfPointsMinValue()
  {
    return GetMaximumNumberOfPointsMinValue_25();
  }

  private native long GetMaximumNumberOfPointsMaxValue_26();
  public long GetMaximumNumberOfPointsMaxValue()
  {
    return GetMaximumNumberOfPointsMaxValue_26();
  }

  private native long GetMaximumNumberOfPoints_27();
  public long GetMaximumNumberOfPoints()
  {
    return GetMaximumNumberOfPoints_27();
  }

  private native void SetInterpolateAttributeData_28(boolean id0);
  public void SetInterpolateAttributeData(boolean id0)
  {
    SetInterpolateAttributeData_28(id0);
  }

  private native boolean GetInterpolateAttributeData_29();
  public boolean GetInterpolateAttributeData()
  {
    return GetInterpolateAttributeData_29();
  }

  private native void InterpolateAttributeDataOn_30();
  public void InterpolateAttributeDataOn()
  {
    InterpolateAttributeDataOn_30();
  }

  private native void InterpolateAttributeDataOff_31();
  public void InterpolateAttributeDataOff()
  {
    InterpolateAttributeDataOff_31();
  }

  public vtkDensifyPointCloudFilter() { super(); }

  public vtkDensifyPointCloudFilter(long id) { super(id); }
  public native long   VTKInit();

}
