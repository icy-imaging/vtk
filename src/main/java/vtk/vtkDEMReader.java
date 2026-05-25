// java wrapper for vtkDEMReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDEMReader extends vtkImageAlgorithm
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native void SetElevationReference_6(int id0);
  public void SetElevationReference(int id0)
  {
    SetElevationReference_6(id0);
  }

  private native int GetElevationReferenceMinValue_7();
  public int GetElevationReferenceMinValue()
  {
    return GetElevationReferenceMinValue_7();
  }

  private native int GetElevationReferenceMaxValue_8();
  public int GetElevationReferenceMaxValue()
  {
    return GetElevationReferenceMaxValue_8();
  }

  private native int GetElevationReference_9();
  public int GetElevationReference()
  {
    return GetElevationReference_9();
  }

  private native void SetElevationReferenceToSeaLevel_10();
  public void SetElevationReferenceToSeaLevel()
  {
    SetElevationReferenceToSeaLevel_10();
  }

  private native void SetElevationReferenceToElevationBounds_11();
  public void SetElevationReferenceToElevationBounds()
  {
    SetElevationReferenceToElevationBounds_11();
  }

  private native byte[] GetElevationReferenceAsString_12();
  public String GetElevationReferenceAsString()
  {
    return new String(GetElevationReferenceAsString_12(), StandardCharsets.UTF_8);
  }

  private native byte[] GetMapLabel_13();
  public String GetMapLabel()
  {
    return new String(GetMapLabel_13(), StandardCharsets.UTF_8);
  }

  private native int GetDEMLevel_14();
  public int GetDEMLevel()
  {
    return GetDEMLevel_14();
  }

  private native int GetElevationPattern_15();
  public int GetElevationPattern()
  {
    return GetElevationPattern_15();
  }

  private native int GetGroundSystem_16();
  public int GetGroundSystem()
  {
    return GetGroundSystem_16();
  }

  private native int GetGroundZone_17();
  public int GetGroundZone()
  {
    return GetGroundZone_17();
  }

  private native float[] GetProjectionParameters_18();
  public float[] GetProjectionParameters()
  {
    return GetProjectionParameters_18();
  }

  private native int GetPlaneUnitOfMeasure_19();
  public int GetPlaneUnitOfMeasure()
  {
    return GetPlaneUnitOfMeasure_19();
  }

  private native int GetElevationUnitOfMeasure_20();
  public int GetElevationUnitOfMeasure()
  {
    return GetElevationUnitOfMeasure_20();
  }

  private native int GetPolygonSize_21();
  public int GetPolygonSize()
  {
    return GetPolygonSize_21();
  }

  private native float[] GetElevationBounds_22();
  public float[] GetElevationBounds()
  {
    return GetElevationBounds_22();
  }

  private native float GetLocalRotation_23();
  public float GetLocalRotation()
  {
    return GetLocalRotation_23();
  }

  private native int GetAccuracyCode_24();
  public int GetAccuracyCode()
  {
    return GetAccuracyCode_24();
  }

  private native float[] GetSpatialResolution_25();
  public float[] GetSpatialResolution()
  {
    return GetSpatialResolution_25();
  }

  private native int[] GetProfileDimension_26();
  public int[] GetProfileDimension()
  {
    return GetProfileDimension_26();
  }

  public vtkDEMReader() { super(); }

  public vtkDEMReader(long id) { super(id); }
  public native long   VTKInit();

}
