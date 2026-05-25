// java wrapper for vtkAdaptiveSubdivisionFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAdaptiveSubdivisionFilter extends vtkPolyDataAlgorithm
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

  private native void SetMaximumEdgeLength_4(double id0);
  public void SetMaximumEdgeLength(double id0)
  {
    SetMaximumEdgeLength_4(id0);
  }

  private native double GetMaximumEdgeLengthMinValue_5();
  public double GetMaximumEdgeLengthMinValue()
  {
    return GetMaximumEdgeLengthMinValue_5();
  }

  private native double GetMaximumEdgeLengthMaxValue_6();
  public double GetMaximumEdgeLengthMaxValue()
  {
    return GetMaximumEdgeLengthMaxValue_6();
  }

  private native double GetMaximumEdgeLength_7();
  public double GetMaximumEdgeLength()
  {
    return GetMaximumEdgeLength_7();
  }

  private native void SetMaximumTriangleArea_8(double id0);
  public void SetMaximumTriangleArea(double id0)
  {
    SetMaximumTriangleArea_8(id0);
  }

  private native double GetMaximumTriangleAreaMinValue_9();
  public double GetMaximumTriangleAreaMinValue()
  {
    return GetMaximumTriangleAreaMinValue_9();
  }

  private native double GetMaximumTriangleAreaMaxValue_10();
  public double GetMaximumTriangleAreaMaxValue()
  {
    return GetMaximumTriangleAreaMaxValue_10();
  }

  private native double GetMaximumTriangleArea_11();
  public double GetMaximumTriangleArea()
  {
    return GetMaximumTriangleArea_11();
  }

  private native void SetMaximumNumberOfTriangles_12(long id0);
  public void SetMaximumNumberOfTriangles(long id0)
  {
    SetMaximumNumberOfTriangles_12(id0);
  }

  private native long GetMaximumNumberOfTrianglesMinValue_13();
  public long GetMaximumNumberOfTrianglesMinValue()
  {
    return GetMaximumNumberOfTrianglesMinValue_13();
  }

  private native long GetMaximumNumberOfTrianglesMaxValue_14();
  public long GetMaximumNumberOfTrianglesMaxValue()
  {
    return GetMaximumNumberOfTrianglesMaxValue_14();
  }

  private native long GetMaximumNumberOfTriangles_15();
  public long GetMaximumNumberOfTriangles()
  {
    return GetMaximumNumberOfTriangles_15();
  }

  private native void SetMaximumNumberOfPasses_16(long id0);
  public void SetMaximumNumberOfPasses(long id0)
  {
    SetMaximumNumberOfPasses_16(id0);
  }

  private native long GetMaximumNumberOfPassesMinValue_17();
  public long GetMaximumNumberOfPassesMinValue()
  {
    return GetMaximumNumberOfPassesMinValue_17();
  }

  private native long GetMaximumNumberOfPassesMaxValue_18();
  public long GetMaximumNumberOfPassesMaxValue()
  {
    return GetMaximumNumberOfPassesMaxValue_18();
  }

  private native long GetMaximumNumberOfPasses_19();
  public long GetMaximumNumberOfPasses()
  {
    return GetMaximumNumberOfPasses_19();
  }

  private native void SetLocator_20(vtkIncrementalPointLocator id0);
  public void SetLocator(vtkIncrementalPointLocator id0)
  {
    SetLocator_20(id0);
  }

  private native long GetLocator_21();
  public vtkIncrementalPointLocator GetLocator()
  {
    long temp = GetLocator_21();

    if (temp == 0) return null;
    return (vtkIncrementalPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutputPointsPrecision_22(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_22(id0);
  }

  private native int GetOutputPointsPrecision_23();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_23();
  }

  private native void CreateDefaultLocator_24();
  public void CreateDefaultLocator()
  {
    CreateDefaultLocator_24();
  }

  private native long GetMTime_25();
  public long GetMTime()
  {
    return GetMTime_25();
  }

  public vtkAdaptiveSubdivisionFilter() { super(); }

  public vtkAdaptiveSubdivisionFilter(long id) { super(id); }
  public native long   VTKInit();

}
