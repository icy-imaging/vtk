// java wrapper for vtkCellValidator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCellValidator extends vtkDataSetAlgorithm
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

  private native int Check_4(vtkGenericCell id0,double id1);
  public int Check(vtkGenericCell id0,double id1)
  {
    return Check_4(id0,id1);
  }

  private native int Check_5(vtkCell id0,double id1);
  public int Check(vtkCell id0,double id1)
  {
    return Check_5(id0,id1);
  }

  private native int Check_6(vtkEmptyCell id0,double id1);
  public int Check(vtkEmptyCell id0,double id1)
  {
    return Check_6(id0,id1);
  }

  private native int Check_7(vtkVertex id0,double id1);
  public int Check(vtkVertex id0,double id1)
  {
    return Check_7(id0,id1);
  }

  private native int Check_8(vtkPolyVertex id0,double id1);
  public int Check(vtkPolyVertex id0,double id1)
  {
    return Check_8(id0,id1);
  }

  private native int Check_9(vtkLine id0,double id1);
  public int Check(vtkLine id0,double id1)
  {
    return Check_9(id0,id1);
  }

  private native int Check_10(vtkPolyLine id0,double id1);
  public int Check(vtkPolyLine id0,double id1)
  {
    return Check_10(id0,id1);
  }

  private native int Check_11(vtkTriangle id0,double id1);
  public int Check(vtkTriangle id0,double id1)
  {
    return Check_11(id0,id1);
  }

  private native int Check_12(vtkTriangleStrip id0,double id1);
  public int Check(vtkTriangleStrip id0,double id1)
  {
    return Check_12(id0,id1);
  }

  private native int Check_13(vtkPolygon id0,double id1);
  public int Check(vtkPolygon id0,double id1)
  {
    return Check_13(id0,id1);
  }

  private native int Check_14(vtkPixel id0,double id1);
  public int Check(vtkPixel id0,double id1)
  {
    return Check_14(id0,id1);
  }

  private native int Check_15(vtkQuad id0,double id1);
  public int Check(vtkQuad id0,double id1)
  {
    return Check_15(id0,id1);
  }

  private native int Check_16(vtkTetra id0,double id1);
  public int Check(vtkTetra id0,double id1)
  {
    return Check_16(id0,id1);
  }

  private native int Check_17(vtkVoxel id0,double id1);
  public int Check(vtkVoxel id0,double id1)
  {
    return Check_17(id0,id1);
  }

  private native int Check_18(vtkHexahedron id0,double id1);
  public int Check(vtkHexahedron id0,double id1)
  {
    return Check_18(id0,id1);
  }

  private native int Check_19(vtkWedge id0,double id1);
  public int Check(vtkWedge id0,double id1)
  {
    return Check_19(id0,id1);
  }

  private native int Check_20(vtkPyramid id0,double id1);
  public int Check(vtkPyramid id0,double id1)
  {
    return Check_20(id0,id1);
  }

  private native int Check_21(vtkPentagonalPrism id0,double id1);
  public int Check(vtkPentagonalPrism id0,double id1)
  {
    return Check_21(id0,id1);
  }

  private native int Check_22(vtkHexagonalPrism id0,double id1);
  public int Check(vtkHexagonalPrism id0,double id1)
  {
    return Check_22(id0,id1);
  }

  private native int Check_23(vtkQuadraticEdge id0,double id1);
  public int Check(vtkQuadraticEdge id0,double id1)
  {
    return Check_23(id0,id1);
  }

  private native int Check_24(vtkQuadraticTriangle id0,double id1);
  public int Check(vtkQuadraticTriangle id0,double id1)
  {
    return Check_24(id0,id1);
  }

  private native int Check_25(vtkQuadraticQuad id0,double id1);
  public int Check(vtkQuadraticQuad id0,double id1)
  {
    return Check_25(id0,id1);
  }

  private native int Check_26(vtkQuadraticPolygon id0,double id1);
  public int Check(vtkQuadraticPolygon id0,double id1)
  {
    return Check_26(id0,id1);
  }

  private native int Check_27(vtkQuadraticTetra id0,double id1);
  public int Check(vtkQuadraticTetra id0,double id1)
  {
    return Check_27(id0,id1);
  }

  private native int Check_28(vtkQuadraticHexahedron id0,double id1);
  public int Check(vtkQuadraticHexahedron id0,double id1)
  {
    return Check_28(id0,id1);
  }

  private native int Check_29(vtkQuadraticWedge id0,double id1);
  public int Check(vtkQuadraticWedge id0,double id1)
  {
    return Check_29(id0,id1);
  }

  private native int Check_30(vtkQuadraticPyramid id0,double id1);
  public int Check(vtkQuadraticPyramid id0,double id1)
  {
    return Check_30(id0,id1);
  }

  private native int Check_31(vtkBiQuadraticQuad id0,double id1);
  public int Check(vtkBiQuadraticQuad id0,double id1)
  {
    return Check_31(id0,id1);
  }

  private native int Check_32(vtkTriQuadraticHexahedron id0,double id1);
  public int Check(vtkTriQuadraticHexahedron id0,double id1)
  {
    return Check_32(id0,id1);
  }

  private native int Check_33(vtkTriQuadraticPyramid id0,double id1);
  public int Check(vtkTriQuadraticPyramid id0,double id1)
  {
    return Check_33(id0,id1);
  }

  private native int Check_34(vtkQuadraticLinearQuad id0,double id1);
  public int Check(vtkQuadraticLinearQuad id0,double id1)
  {
    return Check_34(id0,id1);
  }

  private native int Check_35(vtkQuadraticLinearWedge id0,double id1);
  public int Check(vtkQuadraticLinearWedge id0,double id1)
  {
    return Check_35(id0,id1);
  }

  private native int Check_36(vtkBiQuadraticQuadraticWedge id0,double id1);
  public int Check(vtkBiQuadraticQuadraticWedge id0,double id1)
  {
    return Check_36(id0,id1);
  }

  private native int Check_37(vtkBiQuadraticQuadraticHexahedron id0,double id1);
  public int Check(vtkBiQuadraticQuadraticHexahedron id0,double id1)
  {
    return Check_37(id0,id1);
  }

  private native int Check_38(vtkBiQuadraticTriangle id0,double id1);
  public int Check(vtkBiQuadraticTriangle id0,double id1)
  {
    return Check_38(id0,id1);
  }

  private native int Check_39(vtkCubicLine id0,double id1);
  public int Check(vtkCubicLine id0,double id1)
  {
    return Check_39(id0,id1);
  }

  private native int Check_40(vtkConvexPointSet id0,double id1);
  public int Check(vtkConvexPointSet id0,double id1)
  {
    return Check_40(id0,id1);
  }

  private native int Check_41(vtkPolyhedron id0,double id1);
  public int Check(vtkPolyhedron id0,double id1)
  {
    return Check_41(id0,id1);
  }

  private native int Check_42(vtkLagrangeCurve id0,double id1);
  public int Check(vtkLagrangeCurve id0,double id1)
  {
    return Check_42(id0,id1);
  }

  private native int Check_43(vtkLagrangeTriangle id0,double id1);
  public int Check(vtkLagrangeTriangle id0,double id1)
  {
    return Check_43(id0,id1);
  }

  private native int Check_44(vtkLagrangeQuadrilateral id0,double id1);
  public int Check(vtkLagrangeQuadrilateral id0,double id1)
  {
    return Check_44(id0,id1);
  }

  private native int Check_45(vtkLagrangeTetra id0,double id1);
  public int Check(vtkLagrangeTetra id0,double id1)
  {
    return Check_45(id0,id1);
  }

  private native int Check_46(vtkLagrangeHexahedron id0,double id1);
  public int Check(vtkLagrangeHexahedron id0,double id1)
  {
    return Check_46(id0,id1);
  }

  private native int Check_47(vtkLagrangeWedge id0,double id1);
  public int Check(vtkLagrangeWedge id0,double id1)
  {
    return Check_47(id0,id1);
  }

  private native int Check_48(vtkBezierCurve id0,double id1);
  public int Check(vtkBezierCurve id0,double id1)
  {
    return Check_48(id0,id1);
  }

  private native int Check_49(vtkBezierTriangle id0,double id1);
  public int Check(vtkBezierTriangle id0,double id1)
  {
    return Check_49(id0,id1);
  }

  private native int Check_50(vtkBezierQuadrilateral id0,double id1);
  public int Check(vtkBezierQuadrilateral id0,double id1)
  {
    return Check_50(id0,id1);
  }

  private native int Check_51(vtkBezierTetra id0,double id1);
  public int Check(vtkBezierTetra id0,double id1)
  {
    return Check_51(id0,id1);
  }

  private native int Check_52(vtkBezierHexahedron id0,double id1);
  public int Check(vtkBezierHexahedron id0,double id1)
  {
    return Check_52(id0,id1);
  }

  private native int Check_53(vtkBezierWedge id0,double id1);
  public int Check(vtkBezierWedge id0,double id1)
  {
    return Check_53(id0,id1);
  }

  private native void SetTolerance_54(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_54(id0);
  }

  private native double GetToleranceMinValue_55();
  public double GetToleranceMinValue()
  {
    return GetToleranceMinValue_55();
  }

  private native double GetToleranceMaxValue_56();
  public double GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_56();
  }

  private native double GetTolerance_57();
  public double GetTolerance()
  {
    return GetTolerance_57();
  }

  public vtkCellValidator() { super(); }

  public vtkCellValidator(long id) { super(id); }
  public native long   VTKInit();

}
