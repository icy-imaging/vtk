// java wrapper for vtkLabelPlacer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLabelPlacer extends vtkPolyDataAlgorithm
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

  private native long GetRenderer_4();
  public vtkRenderer GetRenderer()
  {
    long temp = GetRenderer_4();

    if (temp == 0) return null;
    return (vtkRenderer)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetRenderer_5(vtkRenderer id0);
  public void SetRenderer(vtkRenderer id0)
  {
    SetRenderer_5(id0);
  }

  private native long GetAnchorTransform_6();
  public vtkCoordinate GetAnchorTransform()
  {
    long temp = GetAnchorTransform_6();

    if (temp == 0) return null;
    return (vtkCoordinate)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGravity_7(int id0);
  public void SetGravity(int id0)
  {
    SetGravity_7(id0);
  }

  private native int GetGravity_8();
  public int GetGravity()
  {
    return GetGravity_8();
  }

  private native void SetMaximumLabelFraction_9(double id0);
  public void SetMaximumLabelFraction(double id0)
  {
    SetMaximumLabelFraction_9(id0);
  }

  private native double GetMaximumLabelFractionMinValue_10();
  public double GetMaximumLabelFractionMinValue()
  {
    return GetMaximumLabelFractionMinValue_10();
  }

  private native double GetMaximumLabelFractionMaxValue_11();
  public double GetMaximumLabelFractionMaxValue()
  {
    return GetMaximumLabelFractionMaxValue_11();
  }

  private native double GetMaximumLabelFraction_12();
  public double GetMaximumLabelFraction()
  {
    return GetMaximumLabelFraction_12();
  }

  private native void SetIteratorType_13(int id0);
  public void SetIteratorType(int id0)
  {
    SetIteratorType_13(id0);
  }

  private native int GetIteratorType_14();
  public int GetIteratorType()
  {
    return GetIteratorType_14();
  }

  private native long GetMTime_15();
  public long GetMTime()
  {
    return GetMTime_15();
  }

  private native boolean GetPositionsAsNormals_16();
  public boolean GetPositionsAsNormals()
  {
    return GetPositionsAsNormals_16();
  }

  private native void SetPositionsAsNormals_17(boolean id0);
  public void SetPositionsAsNormals(boolean id0)
  {
    SetPositionsAsNormals_17(id0);
  }

  private native void PositionsAsNormalsOn_18();
  public void PositionsAsNormalsOn()
  {
    PositionsAsNormalsOn_18();
  }

  private native void PositionsAsNormalsOff_19();
  public void PositionsAsNormalsOff()
  {
    PositionsAsNormalsOff_19();
  }

  private native boolean GetGeneratePerturbedLabelSpokes_20();
  public boolean GetGeneratePerturbedLabelSpokes()
  {
    return GetGeneratePerturbedLabelSpokes_20();
  }

  private native void SetGeneratePerturbedLabelSpokes_21(boolean id0);
  public void SetGeneratePerturbedLabelSpokes(boolean id0)
  {
    SetGeneratePerturbedLabelSpokes_21(id0);
  }

  private native void GeneratePerturbedLabelSpokesOn_22();
  public void GeneratePerturbedLabelSpokesOn()
  {
    GeneratePerturbedLabelSpokesOn_22();
  }

  private native void GeneratePerturbedLabelSpokesOff_23();
  public void GeneratePerturbedLabelSpokesOff()
  {
    GeneratePerturbedLabelSpokesOff_23();
  }

  private native boolean GetUseDepthBuffer_24();
  public boolean GetUseDepthBuffer()
  {
    return GetUseDepthBuffer_24();
  }

  private native void SetUseDepthBuffer_25(boolean id0);
  public void SetUseDepthBuffer(boolean id0)
  {
    SetUseDepthBuffer_25(id0);
  }

  private native void UseDepthBufferOn_26();
  public void UseDepthBufferOn()
  {
    UseDepthBufferOn_26();
  }

  private native void UseDepthBufferOff_27();
  public void UseDepthBufferOff()
  {
    UseDepthBufferOff_27();
  }

  private native boolean GetOutputTraversedBounds_28();
  public boolean GetOutputTraversedBounds()
  {
    return GetOutputTraversedBounds_28();
  }

  private native void SetOutputTraversedBounds_29(boolean id0);
  public void SetOutputTraversedBounds(boolean id0)
  {
    SetOutputTraversedBounds_29(id0);
  }

  private native void OutputTraversedBoundsOn_30();
  public void OutputTraversedBoundsOn()
  {
    OutputTraversedBoundsOn_30();
  }

  private native void OutputTraversedBoundsOff_31();
  public void OutputTraversedBoundsOff()
  {
    OutputTraversedBoundsOff_31();
  }

  private native int GetOutputCoordinateSystem_32();
  public int GetOutputCoordinateSystem()
  {
    return GetOutputCoordinateSystem_32();
  }

  private native void SetOutputCoordinateSystem_33(int id0);
  public void SetOutputCoordinateSystem(int id0)
  {
    SetOutputCoordinateSystem_33(id0);
  }

  private native int GetOutputCoordinateSystemMinValue_34();
  public int GetOutputCoordinateSystemMinValue()
  {
    return GetOutputCoordinateSystemMinValue_34();
  }

  private native int GetOutputCoordinateSystemMaxValue_35();
  public int GetOutputCoordinateSystemMaxValue()
  {
    return GetOutputCoordinateSystemMaxValue_35();
  }

  private native void OutputCoordinateSystemWorld_36();
  public void OutputCoordinateSystemWorld()
  {
    OutputCoordinateSystemWorld_36();
  }

  private native void OutputCoordinateSystemDisplay_37();
  public void OutputCoordinateSystemDisplay()
  {
    OutputCoordinateSystemDisplay_37();
  }

  public vtkLabelPlacer() { super(); }

  public vtkLabelPlacer(long id) { super(id); }
  public native long   VTKInit();

}
